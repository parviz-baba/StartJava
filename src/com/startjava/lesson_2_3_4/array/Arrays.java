package com.startjava.lesson_2_3_4.array;

public class Arrays {
    static int removeGreaterElements(float[] randomFloats, int address) {
        double threshold = randomFloats[address];
        int zeroedCount = 0;
        for (int i = 0; i < randomFloats.length; i++) {
            if (randomFloats[i] > threshold) {
                randomFloats[i] = 0.0f;
                zeroedCount++;
            }
        }
        return zeroedCount;
    }

    static long calculateFactorial(long number) {
        if (number == 0) return 1;
        long factorial = 1L;
        for (long i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static String formatResult(int number, long result) {
        if (number == 0) return "0! = 1";
        StringBuilder resultString = new StringBuilder(number + "! = ");
        for (int i = 1; i <= number; i++) {
            resultString.append(i);
            if (i < number) resultString.append(" * ");
        }
        if (number > 1) {
            resultString.append(" = ").append(result);
        }
        return resultString.toString();
    }
}