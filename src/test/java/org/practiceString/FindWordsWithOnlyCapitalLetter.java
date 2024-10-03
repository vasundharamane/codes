package org.practiceString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordsWithOnlyCapitalLetter {
    public static void main(String[] args) {
        String str = "THIS is a NEW strinG FOR TESTING";

        Pattern pattern = Pattern.compile("\\b[A-Z]+\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }
}
