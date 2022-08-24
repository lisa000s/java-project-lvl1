package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.COMMON_DIFF_AP;
import static hexlet.code.Engine.MAX_AP_LENGTH;
import static hexlet.code.Engine.MAX_ROUNDS;
import static hexlet.code.Engine.MIN_AP_LENGTH;
import static hexlet.code.Engine.RANDOM_UPPERBOUND;


public class AP {
    private static final String PROMPT = "What number is missing in the progression?";

    public static void start() {
        String[][] qa = new String[MAX_ROUNDS][MAX_ROUNDS - 1];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int startingNum = Utils.generateRandomNum(0, RANDOM_UPPERBOUND);
            int commonDiff = Utils.generateRandomNum(1, COMMON_DIFF_AP);
            int nthTerm = Utils.generateRandomNum(MIN_AP_LENGTH, MAX_AP_LENGTH);
            int[] ap = generateAP(startingNum, commonDiff, nthTerm);
            String[] strArray = new String[ap.length];
            for (int j = 0; j < ap.length; j++) {
                strArray[j] = String.valueOf(ap[j]);
            }
            int skippedNumIndex = Utils.generateRandomNum(0, strArray.length - 1);
            String skippedNum = "";
            StringBuilder finalStr = new StringBuilder();
            for (int k = 0; k < strArray.length; k++) {
                if (skippedNumIndex == k) {
                    skippedNum = strArray[k];
                    finalStr.append(".. ");
                } else {
                    finalStr.append(strArray[k]).append(" ");
                }
            }
            String question = finalStr.toString();
            qa[i][0] = question;
            qa[i][1] = skippedNum;
        }
        Engine.start(PROMPT, qa);
    }
    public static int[] generateAP(int startingNum, int commonDiff, int nthTerm) {
        int currTerm;
        int[] ap = new int[nthTerm + 1];
        currTerm = startingNum;
        for (int j = 0; j <= nthTerm; j++) {
            ap[j] = currTerm;
            currTerm = currTerm + commonDiff;
        }
        return ap;
    }
}
