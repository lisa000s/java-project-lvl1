package hexlet.code;

public class Engine {
    public static final int MAX_ROUNDS = 3;
    public static final int RANDOM_UPPERBOUND = 20;

    static String greeting = "Welcome to the Brain Games!\nMay I have your name? ";

    static String wrongAnswerMessage = " is a wrong answer ;(. Correct answer was ";
    static String tryAgainMessage = "Let's try again, ";
    static String correctMessage = "Correct!";

    public static String getGreeting() {
        return greeting;
    }

    public static String getWrongAnswerMessage() {
        return wrongAnswerMessage;
    }

    public static String getTryAgainMessage() {
        return tryAgainMessage;
    }

    public static String getCorrectMessage() {
        return correctMessage;
    }
}
