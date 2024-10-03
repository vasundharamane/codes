package org.practiceString.Test;

public class Test1 {
    public static void main(String[] args) {
//        given a string AmazonZoon;
//        Reverse String and if any upper case letter found , replace it with space
        String str = "AmazonZoon";
        str = str.replaceAll("[A-Z]", " ");
        char[] strChar = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = strChar.length - 1; i >= 0; i--) {
            sb.append(strChar[i]);
        }

        System.out.println(sb);
    }
}
