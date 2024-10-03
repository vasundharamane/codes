package org.practiceArray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ReadTableDataUsingSelenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table = driver.findElement(By.id("table1"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        List<WebElement> cols = rows.get(0).findElements(By.tagName("th"));

        String[][] tableData = new String[rows.size() - 2][rows.get(0).findElements(By.tagName("th")).size() - 1];
        int col = 0;
        for (int i = 1; i < rows.size() - 1; i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < cols.size() - 1; j++) {
                System.out.println(cols.get(j).getText());
                tableData[i - 1][j] = cols.get(j).getText();
            }
        }

        System.out.println(Arrays.deepToString(tableData));
        driver.quit();
    }
}
