package util;

import java.util.Random;

public class Util {
    public static String createAleatoryEmail(String email) {
        int min = 100;
        int max = 1000;

        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        String aleatory = "" + value;
        return  aleatory + email;
    }
}
