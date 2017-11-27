import java.util.ArrayList;

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
        return (int) (Math.random() * 10);
    }

    public ArrayList getNumberList() {
        return numberList;
    }
}
