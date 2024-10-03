package org.practiceList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("a");
        ls.add("b");
        ls.add(2, "c");


        for (String s : ls) {
            System.out.println(s);
        }

        Iterator<String> iterator = ls.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
