import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntegers {
    public static void main(String[] args) {
        System.out.println(findMin(readIntegers()));
    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splits = (input.split(","));
        int[] values = new int [splits.length];
        for (int i = 0; i < splits.length; i ++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] values){
        Arrays.sort(values);
        return(values[0]);
    }
}
