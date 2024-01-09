import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Tests {
    public static void main(String[] args) {
        int[] integerArray = new int[10];
        integerArray[5] = 50;
        double[] doubleArray = new double[10];
        int[] intArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(intArray));
        for(Object number : intArray){
            System.out.print(number);
        }
        Object[] objectArray = new Object[5];
        objectArray[0] = intArray;
        objectArray[1] = 2;
        objectArray[2] = "sinan";
        objectArray[3] = new StringBuilder("burak");
        System.out.println(objectArray.toString());
        for(Object a : objectArray){
            System.out.println(a);
        }
        Random random = new Random();
        Integer[] array = new Integer[5];
        System.out.println(random.nextInt(100));
        for(int i = 0; i < 5; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.asList(array));
        Arrays.sort(array);
        System.out.println(Arrays.asList(array));
        Collections.reverse(Arrays.asList(array));
        System.out.println((Arrays.asList(array)));
        System.out.println(array);
    }
}
