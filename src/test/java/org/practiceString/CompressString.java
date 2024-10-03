package org.practiceString;

public class CompressString {
    public static void main(String[] args) {
        String str = "aabbbccd";
        char[] charArr = str.toCharArray();
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] == charArr[i - 1]) {
                counter++;
            } else {
                sb.append(charArr[i - 1]).append(counter);
                counter = 1;
            }
        }
        sb.append(charArr[charArr.length-1]).append(counter);
        System.out.println(sb);
    }
}
