package wildFarm.animals;

import wildFarm.foods.Food;
import wildFarm.foods.Meat;

public class Zebra extends Mammal{
    protected Zebra(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }
}
