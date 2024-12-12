package org.practiceIt;

public class ExtractFileExtension {
    public static void main(String[] args) {
        String fileName = "application.pdf";
        System.out.println(getFileExtension(fileName));
    }

    public static String getFileExtension(String fileName) {
        String extension = fileName.substring(fileName.lastIndexOf(".")+1);
        return extension;
    }
}
