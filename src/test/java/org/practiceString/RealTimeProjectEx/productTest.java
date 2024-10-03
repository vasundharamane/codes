package org.practiceString.RealTimeProjectEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class productTest {

    ProductPage_DynamicXpathCreation productPageDynamicXpathCreation;
    WebDriver driver;

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
        productPageDynamicXpathCreation = new ProductPage_DynamicXpathCreation(driver);
        driver.get("http://google.com");
    }

    @Test
    public void test() {
        productPageDynamicXpathCreation.clickOnAddToCard("101");
    }

    @AfterTest
    public void after() {
        driver.quit();
    }

}
