package org.practiceStreams;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegularExpressionWithStream {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Abc", "Xyz", "mno");

        Pattern pattern = Pattern.compile(".*[A-Z].*");

        List<String> op = ls.stream()
                .filter(s -> pattern.matcher(s).matches())
                .collect(Collectors.toList());

        System.out.println(op);
    }
}
