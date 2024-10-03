package org.practiceString;

import javax.sound.midi.Soundbank;

public class SwapTwoString {
    public static void main(String[] args) {
        String s1 = "StringA";
        String s2 = "StringB";

        s1 = s1 + s2; //s1 = StringAStringB s2=StringB
        s2 = s1.substring(s1.indexOf(s2));   //s2=  StringA
        s1 = s1.substring(0,s2.length()); //

        System.out.println(s1);
        System.out.println(s2);

    }
}
