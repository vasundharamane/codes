package org.practiceList;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("str1", "str2", "str3"));
        int a = arrayList.indexOf("str1");
        System.out.println("index is " + a);

    }
}
