package CardsWithPower;

public class Card {
    private CardRanks number;
    private CardSuits color;
    private int power;

    public Card(CardRanks number, CardSuits color){
        this.number = number;
        this.color = color;
        this.power = number.gePower() + color.getPower();
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
     return   String.format("Card name: %s of %s ; Card power: %d", this.number, this.color, this.power);
    }
}
