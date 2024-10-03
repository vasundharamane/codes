package org.practiceList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("String 1");
        ls.add("String 2");
        ls.add("String 3");

        System.out.println(ls);

        ls.remove("String 2");
        System.out.println(ls);

        ls.remove("String 1");

        ls.add(1, "String 4");
        System.out.println(ls);

        System.out.println(ls.get(0));


    }
}
