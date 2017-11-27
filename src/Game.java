public class Game {

    private Player player;
    private Computer computer;
    private View view;
    private boolean finished;

    public Game(View view) {
        player = new Player();
        computer = new Computer();
        this.view = view;
    }

    public void start(){
        finished = false;
        computer.initNumbers();
        while(!finished){
            view.showGameStart();
            player.newGuess();
            finished=true;
        }

    }
}
