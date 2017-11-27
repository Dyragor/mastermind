public class Controller {


    private View view;
    private Game game;

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
            game.start();
        } else if (input.equals("Exit") || input.equals("exit")) {
            System.exit(0);
        } else {
            System.out.println("I don't know this command");
            startGame();
        }

    }

}
