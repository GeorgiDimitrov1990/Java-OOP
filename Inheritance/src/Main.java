import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.eat();
        }

    }
}
