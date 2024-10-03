package org.practiceStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(4);

        List<Integer> evenNumbers = ls.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}
