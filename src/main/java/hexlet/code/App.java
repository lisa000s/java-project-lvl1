package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        Scanner s = new Scanner(System.in);
        int gameNumber = s.nextInt();
        switch (gameNumber) {
            case 0:
                break;
            case 1:
                Cli.greeting();
                break;
            case 2:
                Cli.greeting();
                Even.isEven();
                break;
            default:
                break;
        }
    }
}
