package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int numberOfToppings = Integer.parseInt(input[2]);
      try {

          Pizza pizza = new Pizza(input[1], numberOfToppings);


          input = scanner.nextLine().split("\\s+");

          Dough dough = new Dough(input[1], input[2], Double.parseDouble(input[3]));
          pizza.setDough(dough);
          String command = scanner.nextLine();

          while (!command.equals("END")) {
              input = command.split("\\s+");
              Topping topping = new Topping(input[1], Double.parseDouble(input[2]));
              pizza.addTopping(topping);

              command = scanner.nextLine();
          }

          System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getOverallCalories()));
      } catch (IllegalArgumentException exception){
          System.out.println(exception.getMessage());
      }
    }
}
