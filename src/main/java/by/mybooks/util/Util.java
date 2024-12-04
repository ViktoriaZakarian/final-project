package by.mybooks.util;

import java.util.Random;

public class Util {
    public static String getRandomPasswordConsistsOfSymbols() {
        Random random = new Random();
        int maxLength = 10;
        int minLength = 4;
        int length = random.nextInt(maxLength - minLength + 1) + minLength;

        String symbol = "~!@#$%^&*()_=+-|/?;:";
        char[] symbols = new char[length];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = symbol.charAt(random.nextInt(symbol.length()));
        }
        return new String(symbols);
    }
}
