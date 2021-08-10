package wildFarm.animals;

import wildFarm.foods.Food;
import wildFarm.foods.Meat;

public class Mouse extends Mammal{
    protected Mouse(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAK1");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        super.eat(food);
    }
}
