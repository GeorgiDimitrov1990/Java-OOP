package wildFarm.animals;

public class Cat extends Felime {
    private String breed;

    protected Cat(String name, String type, Double weight, String livingRegion, String breed) {
        super(name, type, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.insert(sb.indexOf(",") + 1, " " + this.breed + ",");
        return sb.toString();
    }
}
