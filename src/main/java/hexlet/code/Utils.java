package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    public static int generateRandomNum(int lowerbound, int upperbound) {
        return ThreadLocalRandom.current().nextInt(lowerbound, upperbound + 1);
    }
}
