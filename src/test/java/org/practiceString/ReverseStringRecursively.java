package org.practiceString;

public class ReverseStringRecursively {
    public static void main(String[] args) {
        String str = "String";
        System.out.println(recursiveMethod(str));
    }

    public static String recursiveMethod(String str) {
        if (str.isEmpty()) {
            return "";
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
