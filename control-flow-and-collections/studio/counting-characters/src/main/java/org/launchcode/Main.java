package org.launchcode;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main (String[] args) {
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap <String, Integer> characters = new HashMap<>();
        String currentCharacter = "";
        for (int i = 0; i < sentence.length(); i++) {
            currentCharacter = String.valueOf(sentence.charAt(i));
            if (!characters.containsKey(currentCharacter)) {
                characters.put(currentCharacter, 1);
            } else {
                characters.put(currentCharacter, characters.get(currentCharacter) + 1);
            }
        }
        System.out.println(characters);

    }
}
