package com.siyun.bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;
    @BeforeEach
    public void setup() {
        game = new Game();
    }

    @Test
    public void shouldReturnZeroWhenCreateNewGame() {
        int expected = 0;
        int actual = game.getTotalScore();
        assertEquals(expected, actual);
    }

}