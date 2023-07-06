package com.endava.letskata.workshops.gdansk.one;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class TestTennisGameScoreAppShould {

    @Test
    public void showPlayerNames() {
        TennisGameApp game = new TennisGameApp("Ann", "Mike");

        // WHEN
        String result = game.showPlayers();

        assertThat(result).isEqualTo("Ann vs. Mike");
    }

    @ParameterizedTest
    @CsvSource({
            "0,0,Love-All",
            "1,0,Fifteen-Love",
            "0,1,Love-Fifteen",
            "2,0,Thirty-Love",
            "0,2,Love-Thirty",
            "3,0,Forty-Love",
            "0,3,Love-Forty",
            "2,1,Thirty-Fifteen",
            "1,2,Fifteen-Thirty",
            "3,1,Forty-Fifteen",
            "1,3,Fifteen-Forty",
            "3,2,Forty-Thirty",
            "2,3,Thirty-Forty",
            "1,1,Fifteen-All",
            "2,2,Thirty-All",
            "3,3,Deuce",
            "4,3,Advantage Ann",
            "3,4,Advantage Mike",
            "5,3,Game Ann",
            "3,5,Game Mike",
    })
    public void shouldReturnProperTextRepresentationOfTheScore(int player1Score,
                                                               int player2Score,
                                                               String expectedResult) {
        // GIVEN
        TennisGameApp game = new TennisGameApp("Ann", "Mike");

        // WHEN
        for (int i = 0; i < player1Score; i++) {
            game.scorePlayer1();
        }
        for (int i = 0; i < player2Score; i++) {
            game.scorePlayer2();
        }
        String result = game.getScore();

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }
}
