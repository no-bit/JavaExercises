import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {
        System.out.println(programStart());
    }

    public static ArrayList<String> programStart() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arraylist = new ArrayList<>();
        int loop = 1;
        while (loop != 0) {
            System.out.printf("Available sections: %n" + "0 - to shutdown %n" +
                    "1 - to add item(s) to list (comma delimited list) %n" +
                    "2 - to remove any items (comma delimited list) %n" +
                    "Enter a number for which action you want to do:");
            int number = scanner.nextInt();
            switch (number) {
                case 0 -> loop = 0;
                case 1 -> {
                    System.out.println("Adding");
                    scanner.nextLine();
                    String input = scanner.nextLine();
                    String[] splits = input.split(",");
                    arraylist.addAll(Arrays.asList(splits));
                    arraylist.sort(Comparator.naturalOrder());
                    System.out.println(arraylist);
                }
                case 2 -> {
                    System.out.println("Removing");
                    scanner.nextLine();
                    String input = scanner.nextLine();
                    String[] splits = input.split(",");
                    arraylist.removeAll(Arrays.asList(splits));
                    arraylist.sort(Comparator.naturalOrder());
                    System.out.println(arraylist);
                }
            }
        }
        return arraylist;
    }
}
