package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

import static hexlet.code.Engine.*;

public class Even {

    private static boolean isEven(int userInput) {
        return userInput % 2 == 0;
    }

    private static String correctAnswer(boolean isEven) {
        if (isEven) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void evenGame() {
        System.out.print(Engine.getGreeting());
        Scanner s = new Scanner(System.in);
        String username = s.next();
        System.out.println("Hello, " + username + "!");
        int rounds = 0;

        for (int i = 0; i < MAX_ROUNDS; i++) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(RANDOM_UPPERBOUND) + 1;
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.\n" + "Question: " + randomNumber);
            System.out.print("Answer: ");
            s = new Scanner(System.in);
            String answer = s.nextLine().toLowerCase();

            if ((isEven(randomNumber) && answer.equals("yes")) || (!isEven(randomNumber) && answer.equals("no"))) {
                System.out.println(Engine.getCorrectMessage());
            } else {
                System.out.println("'" + answer + "'" + Engine.getWrongAnswerMessage() + "'" + correctAnswer(isEven(randomNumber)) + "'.");
                System.out.println(Engine.getTryAgainMessage() + username + "! ");
                break;
            }
            rounds++;
        }
        if (rounds == MAX_ROUNDS) {
            System.out.println("\nCongratulations, " + username + "!");
        }
        s.close();
    }
}
