public class Main {
    public static void main(String[] args) {
        Animal animal = new Person("Martin");
        Mammal mammal = new Person("Gosho");
        Person person = new Person("Pesho");

        System.out.println(animal.move());
        //Typecast  трябва да се избягва.
        if (animal instanceof Person){
            System.out.println(((Person) animal).getName());
        }

        System.out.println(mammal.sleep());
        System.out.println(mammal.move());

        System.out.println(person.getName());
        System.out.println(person.move());
        System.out.println(person.sleep());
    }
}
