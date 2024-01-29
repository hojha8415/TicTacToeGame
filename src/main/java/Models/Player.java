package Models;

public class Player {
    char symbol;
    PlayerType playerType;
    String name;
    public Player(char symbol, PlayerType playerType, String name) {
        this.symbol = symbol;
        this.playerType = playerType;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
