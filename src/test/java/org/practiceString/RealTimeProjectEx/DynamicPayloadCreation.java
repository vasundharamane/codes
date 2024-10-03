package org.practiceString.RealTimeProjectEx;

public class DynamicPayloadCreation {
    public static void main(String[] args) {
        System.out.println(CreateJson.createJson("tanu", "5"));
    }
}

class CreateJson {

    /* {
       "name" : "tanu",
       "age" : "5"
       }
     */
    public static String createJson(String name, String age) {
        return (new StringBuilder().append("{").append("\n").append("\"name\"").append(":").append("\"").append(name).append("\",").append("\n").append("\"age\"").append(":").append("\"").append(age).append("\"").append("\n").append("}")).toString();
    }
}
