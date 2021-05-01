package com.siyun.bowling;

import java.util.Arrays;

public class Game {
    private int[] scores = new int[10];
    private int[] rolls = new int[21];
    private int index = 0;

    public int getTotalScore() {
        return scores[9];
    }

    public void roll(int points) {
        rolls[index] = points;
        index++;
    }

    public void calculateScore() {

        for (int i = 0; i < 18; i += 2) {
            if (rolls[i] + rolls[i + 1] < 10) {
                scores[i / 2] = (i / 2 - 1 < 0 ? 0 : scores[i / 2 - 1]) + (rolls[i] + rolls[i + 1]);
            } else if (rolls[i] == 10){
                scores[i / 2] = (i / 2 - 1 < 0 ? 0 : scores[i / 2 - 1]) + 10 + rolls[i + 2] + (rolls[i + 3] == 0 ? rolls[i + 4] : rolls[i + 3]);
            } else {
                scores[i / 2] += (i / 2 - 1 < 0 ? 0 : scores[i / 2 - 1]) + 10 + rolls[i + 2];
            }
        }
        scores[9] = scores[8] + rolls[18] + rolls[19] + rolls[20];
        System.out.println(Arrays.toString(scores));
    }

}
