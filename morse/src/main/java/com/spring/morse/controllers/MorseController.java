package com.spring.morse.controllers;

import com.spring.morse.entities.MorseCode;
import com.spring.morse.entities.SimpleWord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    @GetMapping("/to-word")
    public String getWord(@RequestParam String code) {
        MorseCode morse = new MorseCode(code);
        return morse.toWord();
    }

    @GetMapping("/to-morse")
    public String getMorse(@RequestParam String word) {
        SimpleWord simpleWord = new SimpleWord(word);
        return simpleWord.toMorse();
    }
}
