import java.util.Scanner;

public class Player {

    private String[] guess;
    private String name;
    private String alter;

    public Player() {

    }

    public String[] getGuess() {
        return guess;
    }

    public void newGuess(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess -> ");
        String input = scanner.nextLine();

        guess = input.split(",");

    }
}
