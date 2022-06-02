package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner s = new Scanner(System.in);
        String username = s.next();
        System.out.println("Hello, " + username + "!");
    }
}
