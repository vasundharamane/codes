package org.practiceString;

public class FindOccOfWord_Split {
    public static void main(String[] args) {
        String statement = "This is a string , I said string, string...";
        String find = "string";
        String[] words = statement.split(" ");
        int counter = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(find))
                counter++;
        }
        System.out.println(counter);
    }
}
