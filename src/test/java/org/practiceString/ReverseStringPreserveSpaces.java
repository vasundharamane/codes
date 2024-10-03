package org.practiceString;


public class ReverseStringPreserveSpaces {
    public static void main(String[] args) {
        String str = "String to preserve space";
        int left = 0;
        int right = str.length() - 1;
        char[] charsInput = str.toCharArray();
        char[] charsOutput = new char[charsInput.length];

        while (left <= right) {
            if (charsInput[left] == ' ') {
                charsOutput[left] = ' ';
                left++;
            }
            if (charsInput[right] == ' ') {
                charsOutput[right] = ' ';
                right--;
            }
            if (left <= right) {
                charsOutput[right] = charsInput[left];
                charsOutput[left] = charsInput[right];
                left++;
                right--;
            }
        }
        System.out.println(charsOutput);
    }
}
