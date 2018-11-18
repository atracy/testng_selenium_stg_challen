package com.pages.skiutah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static org.openqa.selenium.support.How.NAME;
import static org.openqa.selenium.support.How.PARTIAL_LINK_TEXT;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver ldriver){
        this.driver=ldriver;
    }

    //@FindBy(how = How.LINK_TEXT, using using = PARTIAL_LINK_TEXT)
    //private WebElement navigate_to(String Link_Text);

    public void checkPageTitle(String ExpectedTitle){
        Assert.assertEquals(driver.getTitle(), ExpectedTitle);
    }
}
