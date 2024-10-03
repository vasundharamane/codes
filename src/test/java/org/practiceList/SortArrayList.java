package org.practiceList;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(Arrays.asList("mno", "abc", "pqr", "xyz"));
        Collections.sort(ls);
        System.out.println(ls);
    }
}
