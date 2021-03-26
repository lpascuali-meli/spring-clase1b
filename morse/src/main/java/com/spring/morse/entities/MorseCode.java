package com.spring.morse.entities;

import com.spring.morse.utils.MorseUtils;

import java.util.Arrays;

public class MorseCode {
    private String code;

    public MorseCode(String code) {
        this.code = code;
    }

    public String toWord() {
        MorseUtils morseUtils = new MorseUtils();
        StringBuilder text = new StringBuilder();
        String[] wordArray = this.code.split(" {3}");
        System.out.println(Arrays.toString(wordArray));
        for (String word: wordArray) {
            String[] symbolArray = word.split(" ");
            System.out.println(Arrays.toString(symbolArray));
            for (String symbol: symbolArray) {
                text.append(morseUtils.getCharEquivalent(symbol));
            }
            text.append(" ");
        }
        return text.toString();
    }
}
