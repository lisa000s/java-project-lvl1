package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.RANDOM_UPPERBOUND;

public class Prime {
    private static final String PROMPT = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void start() {
        String[][] qa = new String[MAX_ROUNDS][MAX_ROUNDS - 1];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int num = Utils.generateRandomNum(2, RANDOM_UPPERBOUND);
            qa[i][0] = String.valueOf(num);
            qa[i][1] = isPrime(num) ? "no" : "yes";
        }
        Engine.start(PROMPT, qa);
    }
    public static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return num < 2 || flag;
    }
}
