import java.util.Scanner;

public class Controller {

    private View view;
    private Game game;
    private boolean again = true;

    public Controller(){
        view = new View();

    }

    public void initGame(){
        game = new Game(view);
        view.showStart();
    }

    public void startGame(){
        String input = view.showMainMenuAndGetStart();
        if (input.equals("Start") || input.equals("start")) {
            while (again) {
                game.start();
                System.out.println("Want to play another round (y/n)?");
                playAgain();
            }
        } else if (input.equals("Exit") || input.equals("exit")) {
            System.exit(0);
        } else {
            System.out.println("I don't know this command");
            startGame();
        }
    }

    private void playAgain(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("n") || input.equals("N")) {
            again = false;
        } else if (input.equals("y") || input.equals("Y")) {
            //Do nothing
            return;
        }else{
            playAgain();
        }
    }

}
