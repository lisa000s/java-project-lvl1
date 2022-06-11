package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

import static hexlet.code.Engine.*;

public class Calc {

    public static void calcGame() {
        System.out.print(Engine.getGreeting());
        Scanner s = new Scanner(System.in);
        String username = s.next();
        System.out.println("Hello, " + username + "!");
        int rounds = 0;

        for (int i = 0; i < MAX_ROUNDS; i++) {
            Random rand = new Random();
            int randomNumber1 = rand.nextInt(RANDOM_UPPERBOUND) + 1;
            int randomNumber2 = rand.nextInt(RANDOM_UPPERBOUND) + 1;
            char operator = '?';
            int value = 0;

            Random r = new Random();

            switch (r.nextInt(3)) {
                case 0 -> {
                    operator = '+';
                    value = randomNumber1 + randomNumber2;
                }
                case 1 -> {
                    operator = '-';
                    value = randomNumber1 - randomNumber2;
                }
                case 2 -> {
                    operator = '*';
                    value = randomNumber1 * randomNumber2;
                }
            }
            System.out.println("What is the result of the expression?: " + randomNumber1 + operator + randomNumber2);
            System.out.print("Answer: ");
            s = new Scanner(System.in);
            String answer = s.nextLine().toLowerCase();

            if (answer.equals(String.valueOf(value))) {
                System.out.println(Engine.getCorrectMessage());
            } else {
                System.out.println("'" + answer + "'" + Engine.getWrongAnswerMessage() + value);
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
