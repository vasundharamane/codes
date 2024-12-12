package org.practiceIt;

public class SubStringEx {
    public static void main(String[] args) {
        System.out.println(checkIfSubStringExist("Hello world", "world"));
        System.out.println(checkIfSubStrExist("Hello world", "worl1d"));

    }
    public static boolean checkIfSubStringExist(String str , String subStr){
        if(str.contains(subStr)){
            return true;
        }
        return false;
    }

    public static boolean checkIfSubStrExist(String str , String subStr){
        if(str.indexOf(subStr)>0){
            return true;
        }
        return false;
    }
}
