public class SharedDigit {
    public static boolean hasSharedDigit(int number, int number2){
        if (number < 10 || number2 < 10 || number > 99 || number2 > 99 )
            return false;
        int originalNumber2 = number2;
        do {
            int remainder = number % 10;
            do {
                int remainder2 = number2 % 10;
                if (remainder == remainder2)
                    return true;
                number2 = number2 / 10;
            } while (number2 >= 1);
            number2 = originalNumber2;
            number = number / 10;
        }while (number >= 1);
        return false;
    }
}
