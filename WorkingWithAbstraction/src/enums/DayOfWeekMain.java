package enums;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.SUNDAY.ordinal());
        System.out.println(DayOfWeek.SUNDAY);

        DayOfWeek[] values = DayOfWeek.values();
        for (DayOfWeek value : values) {
            System.out.println(value.getDayNumber());
        }

        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value);
        }



    }
}
