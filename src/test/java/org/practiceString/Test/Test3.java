package org.practiceString.Test;

import javax.sound.midi.Soundbank;

public class Test3 {
    public static void main(String[] args) {
        String str = "Interview is in TW Hello";
        System.out.println("output : " + processString(str));
    }

    public static String processString(String str) {
        String[] strtArr = str.split(" ");
        String newStr = "";
        for (int i = strtArr.length - 1; i >= 0; i--) {
            if (i == 0 || i == strtArr.length - 1) {
                String word = strtArr[i];
                String reverseWord = "";
                for (int j = word.length()-1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                    strtArr[i] = reverseWord;
                }
            }
            newStr = newStr + strtArr[i] + " ";
        }

        return newStr;
    }
}
