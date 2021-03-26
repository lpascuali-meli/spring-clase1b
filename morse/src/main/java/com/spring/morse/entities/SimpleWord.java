package com.spring.morse.entities;

import com.spring.morse.utils.MorseUtils;

import java.util.Arrays;

public class SimpleWord {
    private String word;

    public SimpleWord(String word) {
        this.word = word;
    }

    public String toMorse() {
        MorseUtils morseUtils = new MorseUtils();
        StringBuilder text = new StringBuilder();
        String[] wordArray = this.word.split(" ");
        for (String word: wordArray) {
            String[] charArray = word.split("");
            System.out.println(Arrays.toString(charArray));
            for (String symbol: charArray) {
                text.append(morseUtils.getMorseEquivalent(symbol));
                text.append(" ");
            }
            text.append("   ");
        }
        return text.toString();
    }
}
