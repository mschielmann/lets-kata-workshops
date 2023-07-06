package com.endava.letskata.workshops.gdansk.one;

import java.util.Map;

class TennisGameApp {
    private static final Map<Integer, String> SCORE_TO_TEXT_MAPPING = Map.of(
            1, "Fifteen",
            2, "Thirty",
            3, "Forty"
    );

    private final String player1;
    private final String player2;

    private int player1Score = 0;
    private int player2Score = 0;

    TennisGameApp(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void scorePlayer1() {
        player1Score++;
    }

    void scorePlayer2() {
        player2Score++;
    }

    String getScore() {
        if (equalScores(player1Score, player2Score)) {
            if (isOverThirty(player1Score)) {
                return "Deuce";
            }
            return getPlayerScoreAsText(player1Score) + "-All";
        }

        if (anyScoreOverForty(player1Score, player2Score)) {
            String winningPlayer = player1Score > player2Score ? player1 : player2;
            if (isAdvantagePoint()) {
                return "Advantage " + winningPlayer;
            }
            return "Game " + winningPlayer;
        }

        return getPlayerScoreAsText(player1Score) + "-" + getPlayerScoreAsText(player2Score);
    }

    private boolean equalScores(int player1Score, int player2Score) {
        return player1Score == player2Score;
    }

    private boolean isOverThirty(int score) {
        return score > 2;
    }

    private boolean anyScoreOverForty(int player1Score, int player2Score) {
        return player1Score > 3 || player2Score > 3;
    }

    private boolean isAdvantagePoint() {
        return Math.abs(player1Score - player2Score) == 1;
    }

    private String getPlayerScoreAsText(int score) {
        return SCORE_TO_TEXT_MAPPING.getOrDefault(score, "Love");
    }

    String showPlayers() {
        return player1 + " vs. " + player2;
    }
}
