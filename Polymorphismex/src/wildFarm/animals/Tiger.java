package wildFarm.animals;

import wildFarm.foods.Food;
import wildFarm.foods.Meat;
import wildFarm.foods.Vegetable;

public class Tiger extends Felime{
    protected Tiger(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }
}
