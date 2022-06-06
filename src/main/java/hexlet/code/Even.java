package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static final int MAX_ROUNDS = 3;
    public static final int NUM_OF_ROUNDS_BEFORE_MAX = 2;
    public static final int WINS = 3;

    public static void isEven() {
        int rounds = 0;
        int countWins = 0;
        while (rounds < MAX_ROUNDS) {
            Random rand = new Random();
            int upperbound = Integer.BYTES;
            int randomNumber = rand.nextInt(upperbound);
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.\n" + "Question: " + randomNumber);
            Scanner s = new Scanner(System.in);
            System.out.print("Answer: ");
            String answer = s.nextLine().toLowerCase();

            if (randomNumber % 2 == 0) {
                if (answer.equals("yes")) {
                    countWins++;
                    System.out.println("Correct!");
                } else if (answer.equals("no") && (rounds < NUM_OF_ROUNDS_BEFORE_MAX)) {
                    System.out.print("'no' is a wrong answer ;(. Correct answer was 'yes'.\n" + "Let's try again, ");
                    System.out.print(Cli.getUsername() + "! ");
                } else {
                    System.out.print("'no' is a wrong answer ;(. Correct answer was 'yes'.\n");
                }
                rounds++;
            } else {
                if (answer.equals("no")) {
                    countWins++;
                    System.out.println("Correct!");
                } else if (answer.equals("yes") && (rounds < NUM_OF_ROUNDS_BEFORE_MAX)) {
                    System.out.print("'yes' is a wrong answer ;(. Correct answer was 'no'.\n" + "Let's try again, ");
                    System.out.print(Cli.getUsername() + "! ");
                } else {
                    System.out.print("'yes' is a wrong answer ;(. Correct answer was 'no'.\n");
                }
                rounds++;
            }
        }
        if (countWins == WINS) {
            System.out.println("\nCongratulations, " + Cli.getUsername() + "!");
        } else {
            System.out.println("\nSorry, you lost!");
        }
    }
}
