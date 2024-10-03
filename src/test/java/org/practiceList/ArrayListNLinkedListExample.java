package org.practiceList;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListNLinkedListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");

        System.out.println(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("String1");
        System.out.println(linkedList);
    }
}
