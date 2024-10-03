package org.practiceString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordsWithAtleastOneDigit {
    public static void main(String[] args) {
        String str = "This is a sam1ple string for2 testing";
        Pattern pattern = Pattern.compile("\\b\\w*\\d\\w*\\b");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
