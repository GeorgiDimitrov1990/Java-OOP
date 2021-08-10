package animal;

public class Cat extends  Animal{
    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%n" +
                "MEOW", getName(), getFavoriteFood());
    }
}
