package Agregare;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
        this.players = new Player[0]; // echipa poate sa existe cu zero playeri
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

}
