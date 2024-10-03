package org.practicetest.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSquareOfEachNumber {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(6, 2, 1, 2, 9, 8));

        List<Integer> op = arr.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(op);
    }
}
