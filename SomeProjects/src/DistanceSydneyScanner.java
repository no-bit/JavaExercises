import java.util.LinkedList;
import java.util.Scanner;

public class DistanceSydneyScanner {
    Scanner scanner = new Scanner(System.in);

    public void forwardBacwardsListMenuQuit(LinkedList<DistanceSydney> townAndDistanceList) {
        var iterator = townAndDistanceList.listIterator();
        boolean loop = true;
        System.out.printf("Available actions (select word or letter)%n" +
                "(F)orward%n" + "(B)ackward%n" + "(L)ist Places%n" + "(M)enu%n" + "(Q)uit%n");
        String command = scanner.nextLine();
        String letterWord = command;
        while (loop) {
            switch (command) {
                case ("F"), ("Forward") -> print(iterator.next());
                case ("B"), ("Backward") -> print(iterator.previous());
                case ("L"), ("List Places") -> {
                    for (DistanceSydney distanceSydney : townAndDistanceList) {
                        print(distanceSydney);
                    }
                }
                case ("M"), ("Menu") -> System.out.printf("Available actions (select word or letter)%n" +
                        "(F)orward%n" + "(B)ackward%n" + "(L)ist Places%n" + "(M)enu%n" + "(Q)uit%n");
                case ("Q"), ("Quit") -> loop = false;
                default -> System.out.println("Entered wrong");
            }
            System.out.printf("Available actions (select word or letter)%n" +
                    "(F)orward%n" + "(B)ackward%n" + "(L)ist Places%n" + "(M)enu%n" + "(Q)uit%n");
            command = scanner.nextLine();
            if (!command.equals(letterWord) && (letterWord.equals("F") ||
                    letterWord.equals("Forward") || letterWord.equals("B") || letterWord.equals("Backward"))) {
                if ((command.equals("F") || command.equals("Forward"))) {
                    iterator.next();
                } else if (command.equals("B") || command.equals("Backward")) {
                    iterator.previous();
                }
            }
            if ((command.equals("F") || command.equals("Forward") || command.equals("B") || command.equals("Backward"))) {
                letterWord = command;
            }
        }

    }

    public void print(DistanceSydney distanceSydneys) {
        System.out.println(distanceSydneys.getTownName() + " " + distanceSydneys.getDistanceFromSydney());
    }
}
