public class TraditionalSwitchChallenge {

    public static void main(String[] args) {
     switchChar('D');
    }
    public static void switchChar(char switchValue) {
        switch (switchValue){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Message not found");
        }
    }
}
