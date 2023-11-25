public class CalculateInterest {
    public static void main(String[] args) {
        calculateInterest(10000,7.5, 10, 0.25);
    }
    public static void calculateInterest(double amount, double start, double stop, double increment) {
        for(double a = start; a <= stop ; a += increment){
            double interestAmount = calculate(amount, a);
            System.out.println("10000 at " + a + " % interest = " + interestAmount);
        }
    }
    public static double calculate(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
