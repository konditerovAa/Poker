package konditerov.main;

import java.util.*;

public class Player extends GameHelper{
    private int stack;
    private Boolean inGame;
    private Boolean inRound;
    private Boolean allIn;
    private Boolean dealerChip;
    private Boolean isRrealPlayer;
    private Boolean smallBlind;
    private Boolean bijBlind;
    private String name;
    private String firstCard;
    private String secondCard;

    private String[] playersNames = {
            "Кира", "Саша", "Александр", "Вик", "Виктор", "Вова", "Владимир", "Серёжа", "Сергей", "Вера", "Марина", "Маша", "Даша",
            "Никита", "Николай", "Костя", "Константин", "Дима", "Дмитрий", "Артем", "Тема", "Наташа", "Лена", "Елена", "Юля", "Света",
            "Светлана", "Дарина", "Салим", "Иосиф", "Давид", "Данила", "Даниеэл", "Кристина", "Алина"
    };
    private List list = Arrays.asList(playersNames);
    private ArrayList<String> playersNamesList = new ArrayList<String>(list);

    Player(String name, String firstCard, String secondCard){
        this.stack = 1000;
        this.allIn = false;
        this.inGame = true;
        this.inRound = true;
        this.dealerChip = true;
        this.isRrealPlayer = true;
        this.name = name;
        this.smallBlind = false;
        this.bijBlind = false;
    }

    Player(String firstCard, String secondCard){
        getRandomUnit(playersNamesList);
        this.stack = 1000;
        this.inGame = true;
        this.allIn = false;
        this.inRound = true;
        this.dealerChip = false;
        this.isRrealPlayer = false;
        this.name = super.currentRandomUnit;
        this.smallBlind = false;
        this.bijBlind = false;
    }

    public Boolean getDealerChip() {
        return this.dealerChip;
    }

    public int getStack(){
        return this.stack;
    }

    public int setBet(){
        int bet;
        if (isRrealPlayer = true){
            System.out.println("Ваша ставка: ");
            bet = scanner.nextInt();
            scanner.close();
        }else {
            bet = 150;
        }
        this.stack = stack - bet;
        return bet;
    }

    public void setPlayerStatus() {
        if (this.isRrealPlayer == true){
            System.out.println("Ваши карты: " + firstCard + " " + secondCard + " стек: " + stack);
        }
        else {
            System.out.println(name + " стек " + stack);
        }
    }

    public void setFlags(int distribution){
        if (distribution == 0){
            if (this.inGame == true){
                this.inRound = true;
                this.allIn = false;
            }else{
                this.inRound = false;
            }
        }else {
            System.out.println("Пока непонятно что дальше");
        }
    }
}
