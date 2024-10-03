package org.practiceString;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringUse {

    static String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        driver.quit();
    }
}
