package person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    private void setFirstName(String firstName) {
        validateNameLength(firstName, "First name");

        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        validateNameLength(lastName, "Last name");

        this.lastName = lastName;
    }

    private void validateNameLength(String name, String messagePrefix){
        if (name.length() < 3){
            throw new IllegalArgumentException(messagePrefix + " name cannot be less than three letters");
        }
    }

    private void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Person age cannot be less than zero!");
        }
        this.age = age;
    }

    private void setSalary(double salary) {
        if (salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than minimum wage for the country!");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void increaseSalary(double bonus){
        if (this.age < 30){
            bonus /= 2;
        }

        this.salary = this.salary * (1 + bonus / 100);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, this.salary);
    }
}
