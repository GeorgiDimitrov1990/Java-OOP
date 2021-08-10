package JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Matrix matrix = new Matrix(input[0], input[1]);

        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you"))
        {
            int[] ivoParameters = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilParameters = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix.evilPower(evilParameters[0], evilParameters[1]);

            matrix.goodPower(ivoParameters[0], ivoParameters[1]);

            command = scanner.nextLine();
        }

        System.out.println(matrix.getPointsOfIvo());


    }
}
