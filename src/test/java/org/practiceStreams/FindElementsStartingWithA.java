package org.practiceStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementsStartingWithA {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("abc");
        ls.add("pqr");
        ls.add("abc");
        ls.add("aaaa");

        List<String> filteredList = ls.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
