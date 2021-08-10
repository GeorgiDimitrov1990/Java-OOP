package HotelReservation;

public class Main {
    public static void main(String[] args) {
        String inputSeason = "Summer";
        Season season = Season.valueOf(inputSeason.toUpperCase());

        PriceCalculator priceCalculator = new PriceCalculator(season, Discount.VIP, 50.25, 5);
        System.out.println(priceCalculator.calculatePrice());
    }
}
