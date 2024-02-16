package org.javarush.oleksandr.island.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Probably {
    public static double randomDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(max - min) + min;
    }

    public static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(max - min) + min;
    }

    public static boolean calculate(int probability) {
        return ThreadLocalRandom.current().nextInt(100) < probability;
    }
}
