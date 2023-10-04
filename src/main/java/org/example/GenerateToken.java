package org.example;

import java.util.Random;

public class GenerateToken {

    public static String generateToken(int tokenLength) {
        StringBuilder token = new StringBuilder();
        for (int i = 0; i < tokenLength; i++) {
            int asciiChar = new Random().nextInt(255) + 1;
            char tokenChar = (char) asciiChar;
            token.append(tokenChar);

        }
        return token.toString();
    }
}
