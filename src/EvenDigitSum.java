public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0)
            return -1;
        int sum = 0;
        do{
        int remainder = number % 10;
        if (remainder % 2 == 0){
            sum += remainder;
        }
        number = number / 10;
        }while (number > 1);
        return sum;
    }
}
