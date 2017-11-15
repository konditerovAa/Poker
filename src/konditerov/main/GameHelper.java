package konditerov.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {
    private Random random;
    Scanner scanner;
    public String currentRandomUnit;

    public ArrayList<String> getRandomUnit(ArrayList<String> list) {
        int randomCardNumber;
        random = new Random();
        randomCardNumber = random.nextInt((list.size() - 1));
        this.currentRandomUnit = list.get(randomCardNumber);
        list.remove(randomCardNumber);
        return list;
    }

    public void listSearch(){
        for (  )
    }

}
