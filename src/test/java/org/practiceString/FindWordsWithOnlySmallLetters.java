package org.practiceString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordsWithOnlySmallLetters {
    public static void main(String[] args) {
        String str = "sample String for testing";
        Pattern pattern = Pattern.compile("\\b[a-z]+\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
