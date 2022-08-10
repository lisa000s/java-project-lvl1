package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.RANDOM_UPPERBOUND;

public class GCD {
    private static final String PROMPT = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] qa = new String[MAX_ROUNDS][MAX_ROUNDS - 1];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            Random rand = new Random();
            int num1 = rand.nextInt(RANDOM_UPPERBOUND) + 1;
            int num2 = rand.nextInt(RANDOM_UPPERBOUND) + 1;
            qa[i][0] = num1 + " " + num2;
            int gcd = 1;

            for (int j = 1; j <= num1 && j <= num2; j++) {
                if (num1 % j == 0 && num2 % j == 0) {
                    gcd = j;
                }
            }
            qa[i][1] = String.valueOf(gcd);
        }
        Engine.start(PROMPT, qa);
    }
}
