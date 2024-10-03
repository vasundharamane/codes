package org.practiceString;

public class ReverseStatementRecursively {
    public static void main(String[] args) {
        String str =  "reverse this string for program";
        System.out.println(reverseMethod(str));
    }
    public static String reverseMethod(String str){
        if(!str.contains(" "))
        {
            return  str;
        }
        int indexOfSpace = str.indexOf(" ");

        return reverseMethod(str.substring(indexOfSpace+1)) + " " + str.substring(0,indexOfSpace);
    }
}
