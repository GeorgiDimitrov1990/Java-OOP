package StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StudentSystem studentSystem = new StudentSystem();
        while (!input.equals("Exit")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String name = tokens[1];

            switch (command){
                case "Create":
                    int age = Integer.parseInt(tokens[2]);
                    double grade = Double.parseDouble(tokens[3]);
                    studentSystem.createStudent(name, age, grade);
                    break;
                case "Show":
                    studentSystem.showStudent(name);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
