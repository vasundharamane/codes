package org.practiceList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("String1", "String2"));

        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
