package org.practiceString.RealTimeProjectEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProductPage_DynamicXpathCreation {

    @FindBy
    List<WebElement> productList;

    WebDriver driver;

    ProductPage_DynamicXpathCreation(WebDriver driver) {
        this.driver = driver;
    }

    private By getAddToCardLocator(String productID) {
        String xpath = new StringBuilder().append("//span[@id='")
                .append(productID).append("'").append("//button[text()='Add to cart'").toString();
        System.out.println(xpath);
        return By.xpath(xpath);
    }

    public void clickOnAddToCard(String productID) {
        driver.findElement(getAddToCardLocator(productID));
    }

}

