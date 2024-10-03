package org.practiceString;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Kanak";
        char[] strChar = str.toCharArray();

        int left = 0;
        int right = strChar.length - 1;
        boolean flag = true;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                flag = false;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome check "  + flag);
    }
}
