package Models;

import Exceptions.InvalidGameBuildException;
import Strategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private Player winner;
    private GameWinningStrategy gameWinningStrategy;
    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public void displayBoard() {
        this.board.display();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;

        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        private boolean isValid() throws InvalidGameBuildException {
            if(this.dimension < 3){
                throw new InvalidGameBuildException("Dimension less than 3 is invalid");
            }
            if(this.players.size() != this.dimension-1){
                throw new InvalidGameBuildException("Invalid number of players");
            }
            return true;
        }
        public static Builder getBuilder(){
            return new Builder();
        }
        public Game build() throws InvalidGameBuildException{
            //validation
            try{
                isValid();
            }
            catch(InvalidGameBuildException exception){
                throw new InvalidGameBuildException("Something went wrong!");
            }
            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setBoard(new Board(dimension));
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0);
            return game;
        }
    }
}
