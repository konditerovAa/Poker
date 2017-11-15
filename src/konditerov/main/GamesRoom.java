package konditerov.main;

import java.util.ArrayList;
import java.util.Scanner;

public class GamesRoom {
    Scanner scanner;
    Dealer dealer = new Dealer();
    Player player;
    private String theFirstCardOnTheTable;
    private String secondCardOnTheTable;
    private String theThirdCardOnTheTable;
    private String theFourthCardOnTheTable;
    private String theFifthCardOnTheTable;

    private int numberOfPlayers;
    ArrayList<Player> players;

    public ArrayList serPlayers(){
        players = new ArrayList<>();
        scanner = new Scanner(System.in);
        for (int i = 0; i < this.numberOfPlayers; i++){
            String firstCard = dealer.setCard();
            String secondCard = dealer.setCard();
            if (i == 0){
             System.out.println("Как вас зовут?");
             String name = scanner.nextLine();
             players.add(new Player(name, firstCard, secondCard));
            }else {
                players.add(new Player(firstCard, secondCard));
            }
        }
        scanner.close();
        return players;
    }

    public void setNumberOfPlayers() {
        System.out.println("Насколько игроков создаем игру?");
        scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();
        if (numberOfPlayers >= 2 && numberOfPlayers <= 9){
            this.numberOfPlayers = numberOfPlayers;
        }else {
            System.out.println("Минимальное количество игроков 2 максимальное 9");
            setNumberOfPlayers();
        }
    }

    public void getPlayersStatistic(){
        for (int i = 0; i < this.numberOfPlayers; i++){
            Player player = players.get(i);
            player.setPlayerStatus();
        }
    }

    public void playGame(){
        int distribution = 0;


    }
}
