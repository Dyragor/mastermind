import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private String[] guess;
    private ArrayList guessArrayList;

    public Player() {

    }

    public ArrayList getGuess() {
        return guessArrayList;
    }

    public void newGuess(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess -> ");
        String input = scanner.nextLine();

        guess = input.split(",");
        toArrayList();

    }

    private void toArrayList(){
        guessArrayList = new ArrayList();
        for (int i = 0; i < guess.length; i++) {
            guessArrayList.add(Integer.parseInt(guess[i]));
        }
    }
}
