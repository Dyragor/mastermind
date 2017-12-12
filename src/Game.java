import java.util.ArrayList;

public class Game {

    private Player player;
    private Computer computer;
    private View view;
    private int maxRunden = 10;
    private boolean finished;

    public Game(View view) {
        player = new Player();
        computer = new Computer();
        this.view = view;
    }

    public void start() {
        finished = false;
        computer.initNumbers();
        maxRunden = 10;
        while (!finished) {
            view.showGameStart();
            player.newGuess();
            if (isFinished(compare(player.getGuess(), computer.getNumberList()))) {
                finished = true;
                view.congratulations();
                return;
            } else {
                System.out.println(compare(player.getGuess(), computer.getNumberList()));
            }
            maxRunden-=1;
            if(maxRunden <= 0){
                view.failure();
                return;
            }
        }
        view.failure();
    }

    private ArrayList compare(ArrayList guess, ArrayList numbers) {
        ArrayList response = new ArrayList();
        for (int i = 0; i < numbers.size(); i++) {
            if (guess.get(i) == numbers.get(i)) {
                response.add("black");
            } else if (numbers.contains(guess.get(i))) {
                response.add("white");
            } else {
                response.add(" ");
            }
        }
        return response;
    }

    private boolean isFinished(ArrayList response) {
        boolean finish = true;
        for (int i = 0; i < response.size(); i++) {
            if (!response.get(i).equals("black")) {
                finish = false;
            }
        }
        return finish;
    }
}
