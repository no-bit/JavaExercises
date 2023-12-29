import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {2,4,5,7};
        System.out.println(Arrays.toString(reverse(array)));
    }
    private static int[] reverse(int[] array){
        int number = 0;
        int[] array2 = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--){
            array2[number] = array[i];
            number ++;
        }
        return array2;
    }
}
