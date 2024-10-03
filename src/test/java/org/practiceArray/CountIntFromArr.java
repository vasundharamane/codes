package org.practiceArray;

public class CountIntFromArr {
    public static void main(String[] args) {
        String[] str = {"a", "c", "4", "1", "d"};
        int sum = 0;

        for (String a : str) {
            try {
                int n = Integer.parseInt(a);
                sum = sum + n;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        System.out.println(sum);
    }
}
