import java.lang.reflect.*;

import static java.lang.reflect.Array.newInstance;

public class MainReflection {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchFieldException {
        Class<?> clazz = Class.forName("Reflection");


        //////////////////
        //достъпване на методи

        // sys stoinosti
        Method setName = clazz.getDeclaredMethod("setName", String.class);

        // bez stoinosti
        Method getWebAddress = clazz.getDeclaredMethod("getWebAddress");


        /////////////

        System.out.println(clazz.getSimpleName());

        System.out.println(clazz.getSuperclass().getSimpleName());

        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        //правим нова инстанция.
        Reflection instance =(Reflection) clazz.getDeclaredConstructor().newInstance();//вика празният конструктор
        System.out.println(instance.toString());


        Constructor<?>[] constructors = clazz.getConstructors();//дава само публичните конструктори
        Constructor<?>[] constructors1 = clazz.getDeclaredConstructors();//дава всички конструктори
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, String.class, String.class, int.class);//дава прайвит и протектед конструктор


        Reflection reflection = (Reflection) constructor.newInstance("first", "second", "third", 13);// прайвит инт не може да се сетне от конструктор
        // променяне на името чрез метод
        setName.setAccessible(true);
        setName.invoke(reflection, "newName");

        Field[] declaredFields = clazz.getDeclaredFields();




        for (Field declaredField : declaredFields) {

            declaredField.setAccessible(true);
            // ако няма проверка сетва стойноста на такава каквато е в класа
            if (declaredField.getName().equals("zip")){
                declaredField.set(reflection, 13);
            }

            System.out.println(declaredField.get(reflection));
        }

        ///////////////////////
        // достъпване на статичен клас
        Method method = clazz.getDeclaredMethod("getDate");
        method.setAccessible(true);

        String date =(String) method.invoke(null);//подаваме нулл защотот е статик и не приема обект
        System.out.println(date);

        //////
        String[] arr =(String[]) newInstance(String.class, 3);

        Class<?> componentType = arr.getClass().getComponentType();

    }
}
