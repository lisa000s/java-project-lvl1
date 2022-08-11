package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.RANDOM_UPPERBOUND;

public class Even {
    private static final String PROMPT = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void start() {
        String[][] qa = new String[MAX_ROUNDS][MAX_ROUNDS - 1];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int num = Utils.generateRandomNum(0, RANDOM_UPPERBOUND);
            qa[i][0] = String.valueOf(num);
            qa[i][1] = isEven(num) ? "yes" : "no";
        }
        Engine.start(PROMPT, qa);
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
