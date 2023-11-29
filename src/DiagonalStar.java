public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                System.out.println();
                if (i == 1) {
                    for (int a = 1; a <= number; a++) {
                        System.out.print("*");
                    }
                } else if (i <= number / 2) {
                    System.out.print("*");
                    for (int x = 1; x <= i - 2; x++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int x = 1; x <= number - 4 - ((i - 2) * 2); x++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int x = 1; x <= i - 2; x++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                } else if (i < number) {
                    System.out.print("*");
                    for (int x = number - i - 1; x >= 1; x--) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int x = ((i - 1) * 2) - number; x >= 1; x--) {
                        System.out.print(" ");
                    }
                    if (number % 2 == 0 || i != number / 2 + 1)
                        System.out.print("*");
                    for (int x = number - i - 1; x >= 1; x--) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                } else {
                    for (int a = 1; a <= number; a++) {
                        System.out.print("*");
                    }
                }
            }
        }
    }
}