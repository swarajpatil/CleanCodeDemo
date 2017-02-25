package main.java.LongMethod;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class TennisGameRefactored {

    public static final String DEUCE = "Deuce";
    private Integer player1Points = 0, player2Points = 0;
    private String player1Name, player2Name;

    private Map<Integer, String> scoreTextMapping = new HashMap<>();

    public TennisGameRefactored(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        initializeScoreMapping();
    }

    private void initializeScoreMapping() {
        scoreTextMapping.put(0, "Love");
        scoreTextMapping.put(1, "Fifteen");
        scoreTextMapping.put(2, "Thirty");
        scoreTextMapping.put(3, "Forty");
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            player1Points += 1;
        else
            player2Points += 1;
    }

    public String getScore() {
        if (isDeuce()) return DEUCE;
        if (isAdvantage()) return "Advantage " + advantagePlayerName();
        if (isWin()) return "Win for " + winnerName();
        return getPlayer1Score() + "-" + getPlayer2Score();
    }

    private boolean isScoreMoreThanFourty() {
        return player1Points >= 4 || player2Points >= 4;
    }

    private String winnerName() {
        return player1Points - player2Points >= 2 ? player1Name : player2Name;
    }

    private boolean isWin() {
        return isScoreMoreThanFourty() && abs(player1Points - player2Points) >= 2;
    }

    private String advantagePlayerName() {
        return player1Points - player2Points == 1 ? player1Name : player2Name;
    }

    private boolean isAdvantage() {
        return isScoreMoreThanFourty() && abs(player1Points - player2Points) == 1;
    }

    private String getPlayer1Score() {
        return scoreTextMapping.get(player1Points);
    }

    private String getPlayer2Score() {
        return player1Points == player2Points ? "All" : scoreTextMapping.get(player2Points);
    }

    private boolean isDeuce() {
        return player1Points == player2Points && player1Points >= 3;
    }
}
