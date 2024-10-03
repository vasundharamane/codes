package org.practiceString;

public class CountNoOfWordsWithoutSplit {
    public static void main(String[] args) {
        String str = "This is    a string for    testing";
        int counter = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {
                counter++;
            }
        }
        System.out.println(counter + 1);
    }
}
