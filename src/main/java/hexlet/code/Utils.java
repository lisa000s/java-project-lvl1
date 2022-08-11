package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateRandomNum(int upperbound) {
        Random rand = new Random();
        return rand.nextInt(upperbound);
    }
}
