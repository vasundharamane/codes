package org.practiceString;

public class StringDemo {
    public static void main(String[] args) {

//        examples of different string constructors . There are 13 String consutrotrs
        String s4 = new String("s4");
        System.out.println(s4);

        String s = new String(new char[]{'a', 'b'});
        System.out.println(s);

        String s2 = new String(new StringBuffer("sb"));
        System.out.println(s2);

        String s3 = new String(new StringBuilder("sb2"));
        System.out.println(s3);

//        String formatter
       String format = String.format("My name is %s my age is %d , my initials are %c," +
                       " my hight is %f" ,
               "Vasu", 5,'V',5.6);
        System.out.println(format);
    }
}
