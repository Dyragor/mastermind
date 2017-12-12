import java.util.Scanner;

public class View {
    public View() {
    }

    public void showStart(){
        System.out.println("Welcome to Mastermind!");
        System.out.println();
    }

    public String showMainMenuAndGetStart(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("(Start/Exit) -> ");
        String input = scanner.nextLine();

        return input;
    }

    public void showGameStart(){
        System.out.println("Please write your Guess in Numbers and Comma-separated");
    }
    public void congratulations(){System.out.println("Congratulations you won");}
    public void failure(){System.out.println("Failed!!!");}
}
