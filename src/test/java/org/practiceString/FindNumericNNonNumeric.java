package org.practiceString;

public class FindNumericNNonNumeric {
    public static void main(String[] args) {
        String str = "This1 is a samp11le string67";
        char[] strChar = str.toCharArray();

        StringBuilder numericStr = new StringBuilder();
        StringBuilder nonNumericStr = new StringBuilder();

        for (char c : strChar) {
            if (Character.isDigit(c)) {
                numericStr.append(c);
            } else {
                nonNumericStr.append(c);
            }
        }

        System.out.println("numeric :" + numericStr);
        System.out.println("non numeric :" + nonNumericStr);
    }
}
