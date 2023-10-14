package by.it.academy.task6;

public class Calendar {
    public static void main(String[] args) {
        getDayInfo(345);

        System.out.println("Day of the year: " + getDayOfYear(Month.MARCH, 30));
    }

    public static void getDayInfo(int dayOfTheYear) {
        Month[] months = Month.values();
        int numOfMonth = (dayOfTheYear - 1) / 30;
        int dayOfMonth = (dayOfTheYear - 1) % 30 + 1;
        DayOfWeek dayOfWeek = DayOfWeek.values()[(dayOfMonth - 1) % 7];
        Season season = Season.values()[3 / numOfMonth];

        System.out.println(dayOfTheYear + "th day of the year it's: ");
        System.out.println(season + "\n" +  months[numOfMonth].name() + " " + dayOfMonth + "th"
                + ", " + dayOfWeek.name());
        System.out.println();
    }

    public static int getDayOfYear(Month month, int dayOfMonth) {
        return (month.ordinal() * 30) + dayOfMonth;
    }
}
