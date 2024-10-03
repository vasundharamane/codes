package org.practiceString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordsWithAtleastTwoUpperLetter {
    public static void main(String[] args) {
        String str = "THis is a saMPLe word fOR TESTING";

        Pattern pattern = Pattern.compile("\\b\\w*[A-Z]\\w*[A-Z]\\w*\\b");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
