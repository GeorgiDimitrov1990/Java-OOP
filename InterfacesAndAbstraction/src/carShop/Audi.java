package carShop;

public class Audi extends CarImpl implements Rentable {
    private Integer minRentPerDay;
    private Double pricePerDay;



    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentPerDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentPerDay = minRentPerDay;
        this.pricePerDay = pricePerDay;

    }


    @Override
    public Integer getMinRentDay() {
        return this.getMinRentDay();
    }

    @Override
    public Double getPricePerDay() {
        return this.getPricePerDay();
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + " Minimum rental period of " + minRentPerDay
                + " days. Price per day " + pricePerDay;
    }
}
