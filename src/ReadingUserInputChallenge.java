import java.util.Scanner;
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum() {
        int num = 1;
        int sum = 0;
        do {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter Number # " + num + ":");
            try {
                int number = Integer.parseInt(myObj.nextLine());
                sum += number;
                num++;
            } catch (Exception e) {
                System.out.println("Invalid Number");
            }
        } while(num < 6);
        return sum;
    }
}
