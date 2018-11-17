package com.pages.skiutah;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver ldriver){
        this.driver=ldriver;
    }

    public void checkPageTitle(String ExpectedTitle){
        Assert.assertEquals(driver.getTitle(), ExpectedTitle);
    }
}
