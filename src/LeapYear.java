public class LeapYear {
    public static boolean isleapYear(int year) {
        if (1 <= year && year < 9999) {
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
}
