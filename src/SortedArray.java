import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[size];
        for(int i = 0; i < size; i++){
            list[i] = scanner.nextInt();
        }
        return list;
    }

    public static void printArray(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println("Element " + i + " contents " + list[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        Arrays.sort(array);
        int[] a = new int[array.length];
        int b = 0;
        for (int i = array.length - 1; i >= 0; i --) {
            a[b] = array[i];
            b ++;
        }
        return a;
    }
}
