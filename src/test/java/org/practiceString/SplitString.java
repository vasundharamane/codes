package org.practiceString;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SplitString {
    public static void main(String[] args) {
        String s = "This is a string";
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<String> ls = new LinkedList<>();

        for (char c : chars) {
            if (c != ' ') {
                sb.append(c);
            } else {
                ls.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        if (!sb.isEmpty()) {
            ls.add(sb.toString());
        }
        System.out.println(ls);
        //convert to array
        System.out.println(Arrays.toString(ls.toArray()));
    }
}
