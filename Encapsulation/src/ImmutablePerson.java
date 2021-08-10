public class ImmutablePerson {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public ImmutablePerson(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public ImmutablePerson replaceFirstName(String firstName){
        return new ImmutablePerson(firstName, this.lastName, this.age, this.salary);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, this.salary);
    }
}
