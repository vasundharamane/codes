package org.practiceStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("abc", "xyz","abc");
        List<String> op = ls.parallelStream().filter(s-> s.equals("abc"))
                .collect(Collectors.toList());
        System.out.println(op);
    }
}
