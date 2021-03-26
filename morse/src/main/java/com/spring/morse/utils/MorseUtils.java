package com.spring.morse.utils;

import java.util.HashMap;

public class MorseUtils {
    private HashMap<String, String> morseMap;
    private HashMap<String, String> charMap;

    private static String[] chars = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?" };

    private static  String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.." };

    public MorseUtils() {
        morseMap = new HashMap<String, String>();
        charMap = new HashMap<String, String>();
        for (int i = 0; i < chars.length; i++) {
            morseMap.put(morse[i], chars[i]);
            charMap.put(chars[i], morse[i]);
        }
    }

    public static String[] getChars() {
        return chars;
    }

    public static String[] getMorse() {
        return morse;
    }

    public String getCharEquivalent(String character) {
        return morseMap.get(character);
    }

    public String getMorseEquivalent(String morse) {
        return charMap.get(morse);
    }
}
