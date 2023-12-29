import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for(int i = 0; i < size; i ++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }
}
