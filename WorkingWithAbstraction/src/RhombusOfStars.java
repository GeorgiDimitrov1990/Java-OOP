import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        printFigure(n);





    }

    private static void printFigure(int n) {
        printTop(n);
        printBottom(n-1);
    }

    private static void printBottom(int rowsCount) {
        for (int i = 1; i <= rowsCount; i++) {
            printString(i , " ");
            printString(rowsCount - (i-1), "* ");
            System.out.println();
        }
    }

    public static void printTop(int rowsCount) {
        for (int i = 1; i <= rowsCount; i++) {
            printString(rowsCount - i, " ");
            printString(i, "* ");
            System.out.println();
        }
    }


    private static void printString(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
    }

}
