public class Person extends Mammal{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String move() {
        return "Person is walking...";
    }

    @Override
    public String sleep() {
        return "Person sleeps in bed.";
    }
}
