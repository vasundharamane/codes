package org.practiceString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitStringDual {
    public static void main(String[] args) {
        String str = "aabbccdd";
        String[] strArr = str.split("b|c");
        System.out.println(Arrays.toString(strArr));
    }
}
