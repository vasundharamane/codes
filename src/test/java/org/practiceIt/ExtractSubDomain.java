package org.practiceIt;

public class ExtractSubDomain {
    public static void main(String[] args) {
        String url = "https://subdomain.example.com";
        System.out.println(getSubDomain(url));
    }

    public static String getSubDomain(String url) {
        int index = url.indexOf("://");
        String subdomain = url.substring(index+3,url.indexOf("."));
        return subdomain;
    }
}
