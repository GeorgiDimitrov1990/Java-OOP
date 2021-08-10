import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GettersAndSetters {
    public static class MethodComparatorByName implements Comparator<Method>{

        @Override
        public int compare(Method o1, Method o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) {


        Class<Reflection> clazz = Reflection.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();

        Set<Method> getters = new TreeSet<>(new MethodComparatorByName());
        Set<Method> setters = new TreeSet<>(new MethodComparatorByName());


        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get")
                    && declaredMethod.getParameterCount() == 0
            && declaredMethod.getReturnType() != void.class){
                getters.add(declaredMethod);
            }else if (declaredMethod.getName().startsWith("set")
                    && declaredMethod.getParameterCount() == 1
                    && declaredMethod.getReturnType() == void.class){
                setters.add(declaredMethod);
            }

        }

        System.out.println(getters.stream().map(g-> String .format("%s will return class %s",
                g.getName(), g.getReturnType().getName().replace("class", "")))
        .collect(Collectors.joining(System.lineSeparator())));

        System.out.println(setters.stream().map(s-> String .format("%s and will set field of class %s",
                s.getName(), s.getParameterTypes()[0].getName().replace("class", "")))
                .collect(Collectors.joining(System.lineSeparator())));


    }
}
