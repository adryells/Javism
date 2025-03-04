import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100);
        int lowerBound = Math.max(0, targetNumber - 10);
        int upperBound = targetNumber + 10;

        System.out.print("I'm thinking of a number, what is your guess? [0] - EXIT: ");

        while (true) {
            try {
                int userGuessNumber = scanner.nextInt();
                boolean userIsClose = (userGuessNumber >= lowerBound && userGuessNumber <= upperBound);

                if (userGuessNumber == 0) {
                    System.out.println("Exiting...");
                    break;
                } else if (userGuessNumber == targetNumber) {
                    System.out.printf("Right!!! I'm thinking of %d ^^%n", targetNumber);
                    System.out.println("Let's go again! I'm thinking of another number...");

                    targetNumber = (int) (Math.random() * 100);
                    lowerBound = targetNumber - 10;
                    upperBound = targetNumber + 10;
                } else if (userGuessNumber < 0 || userGuessNumber > 100) {
                    System.out.printf("Invalid input '%d'. Must be between 0 and 100.%n", userGuessNumber);
                } else if (userIsClose) {
                    System.out.println("Wrong! But you're so close >:(");
                } else {
                    System.out.println("Wrong! You're so far...");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! You must enter a number between 0 and 100.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
