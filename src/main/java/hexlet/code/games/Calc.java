package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.RANDOM_UPPERBOUND;

public class Calc {
    private static final String PROMPT = "What is the result of the expression?";
    public static void start() {
        String[][] qa = new String[MAX_ROUNDS][MAX_ROUNDS - 1];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            Random rand = new Random();
            int num1 = rand.nextInt(RANDOM_UPPERBOUND) + 1;
            int num2 = rand.nextInt(RANDOM_UPPERBOUND) + 1;
            char operator = '?';
            int value = 0;
            Random r = new Random();
            switch (r.nextInt(MAX_ROUNDS)) {
                case 0 -> {
                    operator = '+';
                    value = num1 + num2;
                }
                case 1 -> {
                    operator = '-';
                    value = num1 - num2;
                }
                case 2 -> {
                    operator = '*';
                    value = num1 * num2;
                }
                default -> System.out.println("Invalid operator");
            }
            qa[i][0] = num1 + " " + operator + " " + num2;
            qa[i][1] = String.valueOf(value);
        }
        Engine.start(PROMPT, qa);
    }
}
