package org.practiceString;

public class ReverseWordOfString {
    public static void main(String[] args) {
        String statement = "reverse words of this string";
        String[] words = statement.split(" ");
        StringBuilder reverseWords =  new StringBuilder();

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWords.append(word.charAt(i));
            }
            reverseWords.append(" ");
        }
        System.out.println(reverseWords);
    }
}
