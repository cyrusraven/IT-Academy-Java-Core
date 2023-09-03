public class Task8 {
    public static void main(String[] args) {
        int dayOfYear = 360;
        int day = 6;
        int month = 13;
        int dayOfMonth = 24;
        System.out.println(dayOfMonth(dayOfYear));
        System.out.println(numOfMonth(month, dayOfMonth));
        System.out.println(dayOfWeek(day));
    }

    static String dayOfMonth(int dayOfYear) {
        if (dayOfYear <= 364 && dayOfYear > 0) {
            if (dayOfYear <= 28) {
                return dayOfYear + " Января, " + whatDayOfWeek(dayOfYear);
            } else {
                dayOfYear -= 28;
                if (dayOfYear <= 28) {
                    return dayOfYear + " Февраля, " + whatDayOfWeek(dayOfYear);
                } else {
                    dayOfYear -= 28;
                    if (dayOfYear <= 28) {
                        return dayOfYear + " Марта, " + whatDayOfWeek(dayOfYear);
                    } else {
                        dayOfYear -= 28;
                        if (dayOfYear <= 28) {
                            return dayOfYear + " Апреля, " + whatDayOfWeek(dayOfYear);
                        } else {
                            dayOfYear -= 28;
                            if (dayOfYear <= 28) {
                                return dayOfYear + " Мая, " + whatDayOfWeek(dayOfYear);
                            } else {
                                dayOfYear -= 28;
                                if (dayOfYear <= 28) {
                                    return dayOfYear + " Июня, " + whatDayOfWeek(dayOfYear);
                                } else {
                                    dayOfYear -= 28;
                                    if (dayOfYear <= 28) {
                                        return dayOfYear + " Июля, " + whatDayOfWeek(dayOfYear);
                                    } else {
                                        dayOfYear -= 28;
                                        if (dayOfYear <= 28) {
                                            return dayOfYear + " Августа, " + whatDayOfWeek(dayOfYear);
                                        } else {
                                            dayOfYear -= 28;
                                            if (dayOfYear <= 28) {
                                                return dayOfYear + " Сентября, " + whatDayOfWeek(dayOfYear);
                                            } else {
                                                dayOfYear -= 28;
                                                if (dayOfYear <= 28) {
                                                    return dayOfYear + " Октября, " + whatDayOfWeek(dayOfYear);
                                                } else {
                                                    dayOfYear -= 28;
                                                    if (dayOfYear <= 28) {
                                                        return dayOfYear + " Ноября, " + whatDayOfWeek(dayOfYear);
                                                    } else {
                                                        dayOfYear -= 28;
                                                        if (dayOfYear <= 28) {
                                                            return dayOfYear + " Декабря, " + whatDayOfWeek(dayOfYear);
                                                        } else {
                                                            dayOfYear -= 28;
                                                            return dayOfYear + " Бредября, " + whatDayOfWeek(dayOfYear);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return "”Не день года”/”Не день месяца”/”Не день недели”";
        }
    }
    static String numOfMonth(int month, int dayOfMonth) {
       return switch (month) {
            case 12 -> dayOfMonth + " Декабря, " + whatDayOfWeek(dayOfMonth);
            case 13 -> dayOfMonth + " Бредября, " + whatDayOfWeek(dayOfMonth);
            case 1 -> dayOfMonth + " Января,  " + whatDayOfWeek(dayOfMonth);
            case 2 -> dayOfMonth + " Февраля, " + whatDayOfWeek(dayOfMonth);
            case 3 -> dayOfMonth + " Марта, " + whatDayOfWeek(dayOfMonth);
            case 4 -> dayOfMonth + " Апреля, " + whatDayOfWeek(dayOfMonth);
            case 5 -> dayOfMonth + " Мая, " + whatDayOfWeek(dayOfMonth);
            case 6 -> dayOfMonth + " Июня, " + whatDayOfWeek(dayOfMonth);
            case 7 -> dayOfMonth + " Июля, " + whatDayOfWeek(dayOfMonth);
            case 8 -> dayOfMonth + " Августа, " + whatDayOfWeek(dayOfMonth);
            case 9 -> dayOfMonth + " Сентября, " + whatDayOfWeek(dayOfMonth);
            case 10 -> dayOfMonth + " Октября, " + whatDayOfWeek(dayOfMonth);
            case 11 -> dayOfMonth + " Ноября, " + whatDayOfWeek(dayOfMonth);
            default -> "”Не день года”/”Не день месяца”/”Не день недели”";
        };
    }
    static String dayOfWeek(int day) {
        return switch (day) {
            case 1, 2, 3, 4, 5 -> "Будний";
            case 6, 7 -> "Выходной";
            default -> "Неправильное число";
        };
    }
    static String whatDayOfWeek(int dayOfYear) {
       return switch (dayOfYear % 7) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 0 -> "воскресенье";
            default -> "ошибка";
        };
    }
}
