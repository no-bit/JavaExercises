public class Tests {
    public static void main(String[] args) {
        String a = "burak";
        StringBuilder b = new StringBuilder("burak");
        String c = new String("burak");
        if (a.equals(c)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
