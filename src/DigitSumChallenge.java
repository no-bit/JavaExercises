public class DigitSumChallenge {
    public static int sumDigits(int number){
        int sum = 0;
        if (number <= 0)
            return -1;
        do {
            sum += number % 10;
            number = number / 10;
        } while (number >= 1);
        return sum;
    }
}
