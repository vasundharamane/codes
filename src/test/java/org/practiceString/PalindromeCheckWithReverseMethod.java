package org.practiceString;

public class PalindromeCheckWithReverseMethod {
    public static void main(String[] args) {
        String str = "Kanak";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        if (str.equalsIgnoreCase(sb.toString())) {
            System.out.println("String is palindrom");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
