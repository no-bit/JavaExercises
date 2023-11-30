import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        System.out.println(minMaxNumber());
    }
    public static String minMaxNumber(){
        double minNumber = Double.MAX_VALUE;
        double maxNumber = Double.MIN_VALUE;
        while(true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter double: ");
            try{
                double number = Double.parseDouble(myObj.nextLine());
                if (number < minNumber)
                    minNumber = number;
                if (number > maxNumber)
                    maxNumber = number;
            } catch(Exception e){
                System.out.println("Finished");
                return ("Minimum Number is = " + minNumber + " Maximum Number is = " + maxNumber);
            }
        }
    }
}
