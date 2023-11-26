public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num = Math.abs(number);
        number = Math.abs(number);
        do{
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        } while (number >= 1);
        return num == reverse;
    }
}
