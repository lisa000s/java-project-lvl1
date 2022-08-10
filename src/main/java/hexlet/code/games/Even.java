package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.RANDOM_UPPERBOUND;

public class Even {
    private static final String PROMPT = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void start() {
        String[][] qa = new String[MAX_ROUNDS][MAX_ROUNDS - 1];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            Random rand = new Random();
            int num = rand.nextInt(RANDOM_UPPERBOUND) + 1;
            qa[i][0] = String.valueOf(num);
            qa[i][1] = num % 2 == 0 ? "yes" : "no";
        }
        Engine.start(PROMPT, qa);
    }
}
