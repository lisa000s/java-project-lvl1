package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String username;

    public static String getUsername() {
        return username;
    }

    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner s = new Scanner(System.in);
        username = s.next();
        System.out.println("Hello, " + username + "!");
    }
}
