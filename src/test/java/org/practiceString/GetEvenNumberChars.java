package org.practiceString;

public class GetEvenNumberChars {
    public static void main(String[] args) {
        String str = "abcdefghi";
        for(int i = 1 ;i<str.length() ; i=i+2){
            System.out.print(str.charAt(i));
        }
    }
}
