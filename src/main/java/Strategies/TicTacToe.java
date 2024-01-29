package Strategies;

import Controllers.GameController;
import Models.Bot;
import Models.BotDifficultyLevel;
import Models.Player;
import Models.PlayerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Models.Game;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimension: ");
        int dimension = scn.nextInt();
        System.out.println("Will there by any bots y/n?");
        String isBotPresent = scn.next();
        int numberOfHumanPlayers = dimension - 1;
        List<Player> playerList = new ArrayList<>();
        if(isBotPresent.equals("y")){
            numberOfHumanPlayers -= 1;
            System.out.println("What is bot's name?");
            String botname = scn.next();
            System.out.println("What is the bot "+botname+"'s symbol?");
            String botsymbol = scn.next();
            playerList.add(new Bot(botsymbol.charAt(0),PlayerType.BOT,botname, BotDifficultyLevel.EASY));
        }
        for(int i = 0; i<numberOfHumanPlayers; i++){
            System.out.println("Enter the name of player #"+(i+1));
            String name = scn.next();
            System.out.println("What is "+name+"'s chosen symbol?");
            String symbol = scn.next();
            playerList.add(new Player(symbol.charAt(0), PlayerType.HUMAN, name));
        }
        //Game game = Game.Builder.getBuilder().setDimension(dimension).setPlayers(playerList).build();
        GameController gameController = new GameController();
        Game game = gameController.createGame(dimension,playerList);
    }
}
