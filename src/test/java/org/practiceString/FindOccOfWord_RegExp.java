package org.practiceString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccOfWord_RegExp {
    public static void main(String[] args) {
        String str = "This is a string , I said string, string...";
        String find = "string";
        int counter = 0;
        Pattern pattern = Pattern.compile(find);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            counter++;
        }
        System.out.println(counter);
    }
}
