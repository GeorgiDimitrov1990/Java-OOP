package Word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        TextTransform textTransform = new TextTransform(text);

        String input = scanner.nextLine();

        while (!input.equals("exit")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int startIndex = Integer.parseInt(tokens[1]);
            int endIndex = Integer.parseInt(tokens[2]);
            switch (command){
                case "cut":
                    textTransform.cut(startIndex,endIndex);
                    break;
                case "paste":
                    textTransform.paste(startIndex,endIndex);
                    break;
                case "uppercase":
                    textTransform.uppercase(startIndex,endIndex);
                    break;
            }

            input = scanner.nextLine();
        }

        textTransform.print();
    }
}
