package org.practiceStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetSquareNumbers {
    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(3);
        ls.add(5);
        ls.add(8);

        List<Integer> squares = ls.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squares);

    }
}
