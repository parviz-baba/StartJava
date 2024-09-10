package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class Arrays {
    static float[] generateRandomFloats(int lenght) {
        float[] randomFloat = new float[lenght];
        Random random = new Random();
        for (int i = 0; i < randomFloat.length; i++) {
            randomFloat[i] = random.nextFloat();
        }
        return randomFloat;
    }

    static int removeGreaterElements(float[] randomFloats, int address) {
        int zeroedCount = 0;
        for (int i = 0; i < randomFloats.length; i++) {
            if (randomFloats[i] > randomFloats[address]) {
                randomFloats[i] = 0.0f;
                zeroedCount++;
            }
        }
        return zeroedCount;
    }
}