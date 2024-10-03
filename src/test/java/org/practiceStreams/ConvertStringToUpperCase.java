package org.practiceStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("String1");
        ls.add("String2");

        List<String> upperCaseStrings = ls.stream().map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCaseStrings);
    }
}
