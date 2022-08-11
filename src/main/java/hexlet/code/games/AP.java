package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

import static hexlet.code.Engine.*;

public class AP {
    private static final String PROMPT = "What number is missing in the progression?";

    public static void start() {
        String[][] qa = new String[MAX_ROUNDS][MAX_ROUNDS - 1];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int startingNum = Utils.generateRandomNum(0, RANDOM_UPPERBOUND);
            int commonDiff = Utils.generateRandomNum(1, 3);
            int nthTerm = Utils.generateRandomNum(MIN_AP_LENGTH, MAX_AP_LENGTH);
            int curr_term;
            String[] ap = new String[nthTerm + 1];
            curr_term = startingNum;
            for (int j = 0; j <= nthTerm; j++) {
                ap[j] = String.valueOf(curr_term);
                curr_term = curr_term + commonDiff;
            }
            int skippedNumIndex = Utils.generateRandomNum(0, ap.length - 1);
            String skippedNum = "";
            for (int k = 0; k < ap.length; k++) {
                if (skippedNumIndex == k) {
                    skippedNum = ap[k];
                    ap[k] = "..";
                }
            }
            qa[i][0] = Arrays.toString(ap);
            qa[i][1] = skippedNum;
        }
        Engine.start(PROMPT, qa);
    }

}
