package CardsWithPower;

import CardRank.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfCard = scanner.nextLine();
        String color = scanner.nextLine();

        Card card = new Card(CardRanks.valueOf(typeOfCard), CardSuits.valueOf(color));

        System.out.println(card.toString());

    }
}
