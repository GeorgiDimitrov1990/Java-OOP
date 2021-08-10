package borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> identifiables = new ArrayList<>();

        while (!input.equals("END")){
            String[] tokens = input.split("\\s+");

            if (tokens.length == 3){
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                identifiables.add(citizen);
            } else {
                Robot robot = new Robot(tokens[0], tokens[1]);
                identifiables.add(robot);
            }

            input = scanner.nextLine();
        }

        String postfixId = scanner.nextLine();

        for (Identifiable identifiable : identifiables) {
            if (identifiable.getId().endsWith(postfixId)){
                System.out.println(identifiable.getId());
            }
        }


    }
}
