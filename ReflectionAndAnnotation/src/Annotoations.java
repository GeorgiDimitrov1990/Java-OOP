import java.lang.annotation.Annotation;

public class Annotoations {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;

        Subject annotation = clazz.getAnnotation(Subject.class);

        for (String category : annotation.categories()) {
            System.out.println(category);
        }

    }
}
