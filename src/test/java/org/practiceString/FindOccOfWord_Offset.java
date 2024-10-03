package org.practiceString;

public class FindOccOfWord_Offset {
    public static void main(String[] args) {
        String str = "This is a string , I said string, string...";
        String find = "string";
        int fromIndex = 0;
        int counter = 0 ;
        while (str.indexOf(find, fromIndex) != -1) {
            counter++;
            fromIndex = str.indexOf(find, fromIndex)+find.length();
        }
        System.out.println(counter);
    }
}
