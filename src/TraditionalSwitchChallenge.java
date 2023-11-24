public class TraditionalSwitchChallenge {

    public static void main(String[] args) {
     switchChar('D');
    }
    public static void switchChar(char switchValue) {
        switch (switchValue) {
            case 'A' -> System.out.println("Able");
            case 'B' -> System.out.println("Baker");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Dog");
            case 'E' -> System.out.println("Easy");
            default -> System.out.println("Message not found");
        }
    }
}
