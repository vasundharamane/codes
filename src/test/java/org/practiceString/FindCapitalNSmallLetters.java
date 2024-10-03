package org.practiceString;

public class FindCapitalNSmallLetters {
    public static void main(String[] args) {
        String str = "AaaaaBccDeeee";
        char[] strChar = str.toCharArray();
        int upper_counter = 0, lower_counter = 0;

        StringBuilder upperCaseLetters = new StringBuilder();
        StringBuilder lowerCaseLetters=  new StringBuilder();

        for (char c : strChar) {
            if (Character.isUpperCase(c)) {
                upper_counter++;
                upperCaseLetters.append(c);
            }
            if (Character.isLowerCase(c)) {
                lower_counter++;
                lowerCaseLetters.append(c);
            }
        }
        System.out.println("upper case " + upper_counter);
        System.out.println("lower case " + lower_counter);
        System.out.println("Upper case letters " + upperCaseLetters);
        System.out.println("Lower case letters " + lowerCaseLetters);
    }
}
