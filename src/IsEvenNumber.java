public class IsEvenNumber {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        for (int i = 5; i <= 20; i ++){
            count = isEvenNumber(i, count);
            if (count == 5){
                break;
            }
        }
    }
    public static int isEvenNumber(int number, int count){
        while (number % 2 == 0){
            count ++;
            System.out.println(number);
                break;
        }
        return count;
    }
}
