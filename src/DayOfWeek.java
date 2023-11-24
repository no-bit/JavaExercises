public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println(printDayOfWeek(4));
        System.out.println(printWeekDay(4));
    }

    public static String printDayOfWeek(int day) {
        String dayOfTheWeek;
        switch (day) {
            case 0 -> dayOfTheWeek = "Sunday";
            case 1 -> dayOfTheWeek = "Monday";
            case 2 -> dayOfTheWeek = "Tuesday";
            case 3 -> dayOfTheWeek = "Wednesday";
            case 4 -> dayOfTheWeek = "Thursday";
            case 5 -> dayOfTheWeek = "Friday";
            case 6 -> dayOfTheWeek = "Saturday";
            default -> dayOfTheWeek = "Invalid Day";
        }
        System.out.println("Day number is " + day + " day of the week is " + dayOfTheWeek);
        return dayOfTheWeek;
    }

    public static String printWeekDay(int day) {
        String dayOfTheWeek = null;
        if (day == 0)
            dayOfTheWeek = "Sunday";
        else if (day == 1)
            dayOfTheWeek = "Monday";
        else if (day == 2)
            dayOfTheWeek = "Tuesday";
        else if (day == 3)
            dayOfTheWeek = "Wednesday";
        else if (day == 4)
            dayOfTheWeek = "Thursday";
        else if (day == 5)
            dayOfTheWeek = "Friday";
        else if (day == 6)
            dayOfTheWeek = "Saturday";
        else
            System.out.println("Invalid Day");
        System.out.println("Day number is " + day + " day of the week is " + dayOfTheWeek);
        return dayOfTheWeek;
    }
}




