package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.*;

public class Calc {
    private static final String PROMPT = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void start() {
        String[][] qa = new String[MAX_ROUNDS][MAX_ROUNDS - 1];
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int num1 = Utils.generateRandomNum(0,RANDOM_UPPERBOUND);
            int num2 = Utils.generateRandomNum(0,RANDOM_UPPERBOUND);
            int operatorIndex = Utils.generateRandomNum(0,RANDOM_OPERATOR_INDEX);
            qa[i][0] = num1 + " " + OPERATORS[operatorIndex] + " " + num2;
            qa[i][1] = String.valueOf(calculate(num1,num2,operatorIndex));
        }
        Engine.start(PROMPT, qa);
    }

    public static int calculate(int num1, int num2, int operatorIndex) {
        int value = 0;
        switch (OPERATORS[operatorIndex]) {
            case '+' -> value = num1 + num2;
            case '-' -> value = num1 - num2;
            case '*' -> value = num1 * num2;
            default -> System.out.println("Invalid operator");
        }
        return value;
    }

}
