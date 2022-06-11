package hexlet.code;

//import hexlet.code.games.Calc;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                Your choice:\s""");
        Scanner s = new Scanner(System.in);
        int gameNumber = s.nextInt();
        switch (gameNumber) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.evenGame();
                break;
            case 3:
                Calc.calcGame();
            default:
                break;
        }
    }
}
