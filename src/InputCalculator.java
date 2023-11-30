import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner myObj = new Scanner(System.in);
        int sum = 0;
        int numCount = 0;
        while(true){
            try{
                int num = Integer.parseInt(myObj.nextLine());
                sum += num;
                numCount ++;
            } catch(Exception e){
                long average = Math.round((double) sum / (double) numCount);
                System.out.println("SUM = " + sum + " AVG = " + average );
                return;
            }
        }
    }
}
