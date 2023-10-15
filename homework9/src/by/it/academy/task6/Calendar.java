package by.it.academy.task6;

public class Calendar {
    public static void main(String[] args) {
        getDayInfo(365);

        getDayOfTheYear();
    }

    public static void getDayInfo(int dayOfTheYear) {
        int numOfTheMonth = 0;
        int dayOfTheMonth;
        int dayOfTheWeek = 1;

        while (true) {
            int daysInTheMonth = Month.values()[numOfTheMonth].getDays();
            if (dayOfTheYear <= daysInTheMonth) {
                dayOfTheMonth = dayOfTheYear;
                break;
            }
            dayOfTheYear -= daysInTheMonth;
            numOfTheMonth++;
        }

        Month month = Month.values()[numOfTheMonth];
        dayOfTheWeek = (dayOfTheWeek + dayOfTheYear - 1) % 7;
        Season season = getSeason(numOfTheMonth);

        System.out.println(season + "\n" +  month + " " + dayOfTheMonth + "th"
                + ", " + DayOfWeek.values()[(dayOfTheWeek + 2) % 7]);
        System.out.println();
    }

    public static void getDayOfTheYear() {
        int dayOfYear = 30;

        for (int i = 0; i < Month.MARCH.ordinal(); i++) {
            dayOfYear += Month.values()[i].getDays();
        }

        System.out.println(Month.MARCH + " " + 30 + "th. " + "Day of the year: " + dayOfYear);
    }

    public static Season getSeason(int numOfTheMonth) {
        if (numOfTheMonth >= 2 && numOfTheMonth <= 4) {
            return Season.SPRING;
        } else if (numOfTheMonth >= 5 && numOfTheMonth <= 7) {
            return Season.SUMMER;
        } else if (numOfTheMonth >= 8 && numOfTheMonth <= 10) {
            return Season.AUTUMN;
        } else {
            return Season.WINTER;
        }
    }
}
