package hexlet.code;

import hexlet.code.games.AP;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCDIV = 4;
    private static final int APROG = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        prompt();
        Scanner s = new Scanner(System.in);
        int gameNumber = s.nextInt();
        switch (gameNumber) {
            case GREET -> Cli.greeting();
            case EVEN -> Even.start();
            case CALC -> Calc.start();
            case GCDIV -> GCD.start();
            case APROG -> AP.start();
            case PRIME -> Prime.start();
            default -> System.out.println("Invalid choice");
        }
    }

    public static void prompt() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - AP
                6 - Prime
                0 - Exit
                Your choice:\s""");
    }
}
