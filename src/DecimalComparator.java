public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.174 , 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175 , 3.176));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        return (Math.abs(firstNumber - secondNumber) < 0.0009999999999998);
    }
}
