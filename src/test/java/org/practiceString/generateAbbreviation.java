package org.practiceString;

public class generateAbbreviation {
    public static void main(String[] args) {
        String str = "Quality Assurance Practices";
        String[] shortForm = str.split(" ");
        StringBuilder shortAb = new StringBuilder();
        for (String s : shortForm) {
            shortAb.append(s.charAt(0));
        }
        System.out.println(shortAb);
    }
}
