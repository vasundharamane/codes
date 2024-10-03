package org.practicetest.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringStartingWithA {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>(Arrays.asList("ABC", "aaaA", "Aaaa", "mnsoaa"));

        List<String> op =
                s.stream()
                        .filter(str -> str.startsWith("A"))
                        .collect(Collectors.toList());

        System.out.println(op);

    }
}
