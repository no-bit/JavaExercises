public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;
        int result = number % 10;
        while (true) {
            int remainder = number % 10;
            number = number / 10;
            if (number < 1) {
                result += remainder;
                break;
            }
        }return result;
    }
}
