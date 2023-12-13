import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int b = scanner.nextInt();
        String c = scanner.next();
        int d = scanner.nextInt();
        String e = scanner.next();
        int f = scanner.nextInt();
        scanner.close();
        String i;
        if (b < 10){
            i = ("00" + b);
        } else if (b < 100){
            i = ("0" + b);
        } else {
            i = ("" + b);
        }
        String h;
        if (d < 10){
            h = ("00" + d);
        } else if (d < 100){
            h =("0" + d);
        } else {
            h = "" + d;
        }
        String g;
        if (f < 10){
            g = ("00" +  f);
        } else if (f < 100){
            g = ("0" + f);
        } else {
            g = "" + f;
        }
        System.out.println("================================");
        System.out.printf("%-15s%1s%n", a, i);
        System.out.printf("%-15s%1s%n", c, h);
        System.out.printf("%-15s%1s%n", e, g);
        System.out.println("================================");
    }
}