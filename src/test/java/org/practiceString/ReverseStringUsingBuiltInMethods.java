package org.practiceString;

public class ReverseStringUsingBuiltInMethods {
    public static void main(String[] args) {
        String str = "reverse";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
