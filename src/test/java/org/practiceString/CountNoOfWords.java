package org.practiceString;

public class CountNoOfWords {
    public static void main(String[] args) {
        String str = "Count number of words from this string";
        String[] strArr = str.split(" ");
        System.out.println(strArr.length);
    }
}
