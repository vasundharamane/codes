package org.practiceList.selenium;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.List;

public class ReadCSVFile {
    public static void main(String[] args) {
        String filePath = "/Users/vasundhara.mane/Documents/Personal/Interview Preparation/git/codes/src/test/java/org/practiceList/selenium/data.csv";

        try {
            CSVReader reader = new CSVReader(new FileReader(filePath));
            List<String[]> allRows = reader.readAll();

            for (String[] s : allRows) {
                System.out.println(s[0] + "        " + s[1]);
            }
        } catch (Exception e) {
        }
    }
}
