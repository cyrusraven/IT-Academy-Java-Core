public class Task8 {
    public static void main(String[] args) {
        int dayOfYear = 360;
        int dayOfMonth = dayOfYear % 28;
        int month = dayOfYear / 28 + 1;
        int numOfMonth = 13;
        int dayOfWeek = dayOfMonth % 7;
        System.out.println(dateWithDayOfWeek(dayOfYear, dayOfMonth, month, dayOfWeek));
        System.out.println(getDateWithDayOfWeek(numOfMonth));
    }

    static String dateWithDayOfWeek(int dayOfYear, int dayOfMonth, int month, int dayOfWeek) {
        if (dayOfYear <= 364 && dayOfYear > 0) {
            return dayOfMonth + getMonth(month) + "," + dayOfWeek(dayOfYear) + ", " + weekendOrWeekday(dayOfWeek);
        } else {
            return "Не день года/Не день месяца/Не день недели";
        }
    }

    static String getDateWithDayOfWeek(int numOfMonth) {
        int dayOfMonth1 = 24;
        int dayOfWeek1 = dayOfMonth1 % 7;
        return switch (numOfMonth) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 -> dayOfMonth1 + getMonth(numOfMonth) + ","
                    + dayOfWeek(dayOfWeek1) +  ", " + weekendOrWeekday(dayOfWeek1);
            default -> "”Не день года”/”Не день месяца”/”Не день недели”";
        };
    }

    static String getMonth(int month) {
        return switch (month) {
            case 1 -> " Января";
            case 2 -> " Февраля";
            case 3 -> " Марта";
            case 4 -> " Апреля";
            case 5 -> " Мая";
            case 6 -> " Июня";
            case 7 -> " Июля";
            case 8 -> " Августа";
            case 9 -> " Сентября";
            case 10 -> " Октября";
            case 11 -> " Ноября";
            case 12 -> " Декабря";
            case 13 -> " Бредября";
            default -> "Ошибка";
        };
    }

    static String dayOfWeek(int dayOfYear) {
        return switch (dayOfYear % 7) {
            case 1 -> " понедельник";
            case 2 -> " вторник";
            case 3 -> " среда";
            case 4 -> " четверг";
            case 5 -> " пятница";
            case 6 -> " суббота";
            case 0 -> " воскресенье";
            default -> "ошибка";
        };
    }

    static String weekendOrWeekday(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "будний";
            case 6, 7 -> "выходной";
            default -> "Неправильное число";
        };
    }
}
