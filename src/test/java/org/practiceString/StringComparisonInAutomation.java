package org.practiceString;

import org.testng.Assert;

public class StringComparisonInAutomation {
    public static void main(String[] args) {
        String expectedText = "Success";
        String actualText = "Success";
        Assert.assertEquals(expectedText,actualText);
    }
}
