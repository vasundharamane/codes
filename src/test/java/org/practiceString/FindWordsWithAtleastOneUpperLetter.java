package org.practiceString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordsWithAtleastOneUpperLetter {
    public static void main(String[] args) {
        String str = "This is a SAMPle sTring";
        Pattern pattern = Pattern.compile("\\b\\w*[A-Z]\\w*\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
