package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static final int RANDOM_UPPERBOUND = 20;
    public static final int RANDOM_OPERATOR_INDEX = 2;
    public static void start(String prompt, String[][] qa) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("\nHello, " + username + "!\n");
        System.out.println(prompt + "\n");
        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + qa[i][0]);
            String userAnswer = scanner.next().toLowerCase();
            if (!qa[i][1].equals(userAnswer)) {
                System.out.println(
                        "\n" + "'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was" + " '"
                                + qa[i][1] + "'." + "\nLet's try again, " + username + "!");
                return;
            }
            System.out.println("Correct!\n");
        }
        System.out.println("Congratulations, " + username + "!");
        scanner.close();
    }
}
