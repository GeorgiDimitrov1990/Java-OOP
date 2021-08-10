import demo.Planets;

public class MainDemo {
    public static void main(String[] args) throws ClassNotFoundException {
     Class<Planets> planetsClass = Planets.class;

        Class<?> clazz = Class.forName("demo.Planets");//ако не са в един пекидж, трябва да се посочи пътя до файла

        Class<?> superclass = clazz.getSuperclass();// взима само класа, от който е наследен

        Class<?>[] interfaces = clazz.getInterfaces();// взима само директно наследените интерфейси
    }
}
