package main.java.SpeculativeGenerality;

public class Game implements IGame {
    private IGameSaver gameSaver;
    private ConsoleGui consoleGui;
    private int numberOfPlayers;

    public Game(IGameSaver gameSaver, ConsoleGui consoleGui) {
        this.gameSaver = gameSaver;
        this.consoleGui = consoleGui;
    }

    public void saveGame() {
        gameSaver.save(this);
    }

    public void startNewGame() throws Exception {
        numberOfPlayers = consoleGui.readNextRoll();
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    private class ConsoleGui {
        public int readNextRoll() {
            return 0;
        }
    }
}
