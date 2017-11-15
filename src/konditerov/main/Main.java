package konditerov.main;

public class Main {

    public static void main(String[] args) {
        GamesRoom gamesRoom = new GamesRoom();

        gamesRoom.setNumberOfPlayers();
        gamesRoom.serPlayers();
        gamesRoom.getPlayersStatistic();
    }
}
