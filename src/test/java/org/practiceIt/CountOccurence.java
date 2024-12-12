package org.practiceIt;

public class CountOccurence {
    public static void main(String[] args) {
        String str = "Hello world world world !";
        String subStr = "world";
        System.out.println(getSubStrCount(str,subStr));
    }

    public static int getSubStrCount(String str, String subStr) {
        int index  = str.indexOf(subStr);
        int counter = 0;
        while (index > 0) {
            counter++;
            index  = str.indexOf(subStr,index+1);
        }
        return counter;
    }
}
