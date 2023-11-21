public class TeenNumberChecker {
    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {
        return numberOne <= 19 && numberOne >= 13 || numberTwo <= 19 && numberTwo >= 13 || numberThree <= 19 && numberThree >= 13 ;
    }
    public static boolean isTeen(int aNumber) {
        return (13 <= aNumber) && (19 >= aNumber);
    }
}
