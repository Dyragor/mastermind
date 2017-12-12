import java.util.ArrayList;
import java.util.Random;

public class Computer {

    private ArrayList numberList;

    public Computer() {

    }

    public void initNumbers() {
        numberList = new ArrayList();
        do {
            numberList.add(randomNumber());
        } while (numberList.size() < 4);
    }

    private int randomNumber() {
        Random rn = new Random();
        return rn.nextInt((9) + 1);
    }

    public ArrayList getNumberList() {
        return numberList;
    }
}
