package com.pages.skiutah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DealsPage {

    WebDriver driver;

    public DealsPage(WebDriver ldriver){
        this.driver=ldriver;
    }

    //@FindBy(how = How.LINK_TEXT, using using = PARTIAL_LINK_TEXT)
    //private WebElement navigate_to(String Link_Text);

    public void navigateTo(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public void VerifyOnDealsPage(){

        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='LayoutInterior-pageTitle'] H1")).isDisplayed());
    }
    public void checkPageTitle(String ExpectedTitle){
        Assert.assertEquals(driver.getTitle(), ExpectedTitle);
    }

}
