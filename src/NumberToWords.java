public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(reverse(100));
        numberToWords(100);
        System.out.println(getDigitCount(100));
    }
    public static void numberToWords(int number){
        int totalDigits = getDigitCount(number);
        int printed = 0;
        number = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        do{
            int remainder = number % 10;
            switch(remainder) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            number = number / 10;
            printed ++;
        } while (number != 0);
        for (int i = 0; i < totalDigits - printed; i++ ){
            System.out.println("Zero");
        }
    }
    public static int reverse(int number){
        boolean negative = number < 0;
        int reverse = 0;
        number = Math.abs(number);
        do{
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        } while (number >= 1);
        if (negative)
            return -reverse;
        return reverse;
    }
    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        if (number == 0)
            return 1;
        int digits = 0;
        do{
            number = number / 10;
            digits ++;
        } while(number >= 1);
    return digits;
    }
}

