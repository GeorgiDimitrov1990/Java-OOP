package wildFarm.animals;

import wildFarm.foods.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    private String name;
    private String type;
    private Double weight;
    private int foodEaten;
    private String livingRegion;

    public Animal(String name, String type, Double weight, String livingRegion) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.livingRegion = livingRegion;
    }

    public abstract void makeSound();

    protected String getType(){
        return this.type;
    }

    public void eat(Food food){
        this.foodEaten =+ food.getQuantity();
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("##.##");

        return String.format("%s[%s, %s, %s, %d",
                this.type,
                this.name,
                formatter.format(this.weight),
                this.livingRegion,
                this.foodEaten);
    }
}
