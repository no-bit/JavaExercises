public class PrimeNumberChallenge {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(222334565193649d));
    }
    public static boolean isPrimeNumber(double number) {
        if (number <= 0){
            System.out.println("Invalid Number");
        }else if (number == 1) {
            return false;
        }else if (number == 2) {
            return true;
        } else {
            if (number % 2 == 0) {
                return false;
            } else {
                for (double i = 3; i <= Math.sqrt(number); i+=2 ){
                    if (number % i == 0){
                        return false;
                    }
                }
            }
        }return true;
    }
}
