package com.siyun.bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;
    @BeforeEach
    public void setup() {
        game = new Game();
    }

    @Test
    @DisplayName("should return 0 when create a new game")
    public void shouldReturnZeroWhenCreateNewGame() {
        int expected = 0;
        int actual = game.getTotalScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return 0 all gutters game")
    public void shouldScoreZeroForAllGutters() {
        int expected = 0;
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.calculateScore();
        int actual = game.getTotalScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return 20 for all ones game")
    public void shouldScore20ForAllOnes() {
        int expected = 20;
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(1);
        game.roll(0);
        game.calculateScore();
        int actual = game.getTotalScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return 19 for one spare followed by 2 rolls of 3 pins")
    public void shouldScore19ForOneSpareFollowedByTwoRollsWithThreePins() {
        int expected = 19;
        game.roll(0);
        game.roll(0);
        game.roll(5);
        game.roll(5);
        game.roll(3);
        game.roll(3);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.calculateScore();
        int actual = game.getTotalScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return 22 for one strike followed by 2 rolls of 3 pins")
    public void shouldScore22ForOneStrikeFollowedByTwoRollsWithThreePins() {
        int expected = 22;
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(3);
        game.roll(3);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.roll(0);
        game.calculateScore();
        int actual = game.getTotalScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return 300 for perfect game")
    public void shouldScore300ForPerfectGame() {
        int expected = 300;
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.calculateScore();
        int actual = game.getTotalScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return correct score for a random game")
    public void shouldReturnCorrectScoreAGame() {
        int expected = 181;
        game.roll(7);
        game.roll(3);
        game.roll(7);
        game.roll(2);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(0);
        game.roll(3);
        game.roll(1);
        game.roll(0);
        game.roll(10);
        game.roll(5);
        game.roll(4);
        game.roll(10);
        game.roll(0);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.calculateScore();
        int actual = game.getTotalScore();
        assertEquals(expected, actual);
    }
}