package org.practiceString.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        String str = "AmAzOnazon";
        //Output : "AO"
        // Question : characters that are duplicate
        // and one letter upper case and lower case

        Set<Character> upperCase = new HashSet<>();
        Set<Character> lowerCase = new HashSet<>();
        Set<Character> resultSet = new HashSet<>();

//        filter  only upper case letters
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            upperCase.add(matcher.group().charAt(0));
        }
        System.out.println(upperCase);


        //        filter  only lower case letters
        pattern = Pattern.compile("[a-z]");
        matcher = pattern.matcher(str);
        while (matcher.find()) {
            lowerCase.add(matcher.group().charAt(0));
        }
        System.out.println(lowerCase);

        //find intersection between two
        for (char c : upperCase) {
            if (lowerCase.contains(Character.toLowerCase(c))) {
                resultSet.add(c);
            }
        }

        System.out.println(resultSet);
    }
}
