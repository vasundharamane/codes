package org.practiceList;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>(Arrays.asList(1, 2, 1, 6, 0));
        ls.add(6);

        Set<Integer> set = new HashSet<>(ls);

        System.out.println(set);

    }
}
