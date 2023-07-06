package com.endava.letskata.workshops.gdansk.one;

class TennisGameApp {

    private int playerOneScore = 0;

    public TennisGameApp(final String player1, final String player2) {
    }

    String getScore() {
        if (playerOneScore > 0) {
            return "Fifteen-Love";
        }
        return "Love-all";
    }

    String showPlayers() {
        return "Ann vs. Mike";
    }

    void scorePlayer1() {
        playerOneScore++;
    }
}
