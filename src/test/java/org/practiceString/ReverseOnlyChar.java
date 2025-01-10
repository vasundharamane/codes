package org.practiceString;

import java.util.Arrays;

public class ReverseOnlyChar {
    public static void main(String[] args) {
        //reverse only alphabets in a string , keep the non letters as it is
        String str = "34test909gda@sdet!123pro";

        System.out.println("Reverse string " + reverseStr(str));
    }

    public static String reverseStr(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] chars =  str.toCharArray();

        while (left < right) {
            if (Character.isLetter(chars[left])) {
                if (Character.isLetter(chars[right])) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right]  = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        System.out.println(Arrays.toString(chars));
        return new String(chars);
    }
}
