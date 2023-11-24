public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if (1 <= year && year <= 9999) {
            if ( year % 4 == 0){
                if ( year % 100 == 0){
                    return year % 400 == 0;
                }else {
                    return true;
                }
            }else{
                return false;
            }
        } else {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year){
        if (month < 13 && month > 0 && year < 10000 && year > 0){
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> {
                    if (!isLeapYear(year)) {
                        yield 28;
                    } else {
                        yield 29;
                    }
                }
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        }
        return -1;}
}
