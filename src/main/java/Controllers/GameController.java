package Controllers;

import Exceptions.InvalidGameBuildException;
import Models.Game;
import Models.GameStatus;
import Models.Player;

import java.util.List;

public class GameController  {
    public Game createGame(int dimension, List<Player> playerList){
        try{
            return Game.Builder.getBuilder().setDimension(dimension)
                    .setPlayers(playerList)
                    .build();
        }
        catch(Exception e){
            return null;
        }
    }
    public void undo(Game game){

    }
    public void displayBoard(Game game){
        game.displayBoard();
    }
    public Player getWinner(Game game){
        return null;
    }
    public void executeNextMove(Game game){

    }
    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

}
