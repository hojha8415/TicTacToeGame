package Models;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Bot(char symbol, PlayerType playerType, String name, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, playerType.BOT, name);
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
