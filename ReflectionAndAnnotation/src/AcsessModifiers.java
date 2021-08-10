import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AcsessModifiers {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        Method[] methods =  clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()));
        }

    }
}
