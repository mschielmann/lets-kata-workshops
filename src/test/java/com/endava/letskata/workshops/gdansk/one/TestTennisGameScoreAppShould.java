package com.endava.letskata.workshops.gdansk.one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class TestTennisGameScoreAppShould {


    @Test
    public void returnLoveAllAtBeginning() {
        // GIVEN
        TennisGameApp game = new TennisGameApp("Ann", "Mike");

        // WHEN
        String result = game.getScore();

        // THEN
        assertThat(result).isEqualTo("Love-all");
    }

    @Test
    public void showPlayerNames() {
        TennisGameApp game = new TennisGameApp("Ann", "Mike");

        // WHEN
        String result = game.showPlayers();

        assertThat(result).isEqualTo("Ann vs. Mike");
    }

    @Test
    public void returnFifteenLoveWhenFirstPlayerScores() {
        // GIVEN
        TennisGameApp game = new TennisGameApp("Ann", "Mike");

        // WHEN
        game.scorePlayer1();
        String result = game.getScore();

        // THEN
        assertThat(result).isEqualTo("Fifteen-Love");
    }
}
