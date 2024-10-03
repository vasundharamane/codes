package org.practiceString.RealTimeProjectEx;

public class UseOfReplaceAll {
    public static void main(String[] args) {
        String str = "$1,00,000.00";
        String val = str.replaceAll("\\$|,","");
        System.out.println(val);

    }
}
