package org.practicetest.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>(Arrays.asList(4, 2, 1, 0, 5));

        List<Integer> op = n.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(op);
    }
}
