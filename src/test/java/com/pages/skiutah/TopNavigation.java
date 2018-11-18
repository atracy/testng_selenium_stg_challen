package com.pages.skiutah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TopNavigation {

    WebDriver driver;

    public TopNavigation(WebDriver ldriver){
        this.driver=ldriver;
    }

    public void navigateTo(String linkText) {
        String menuSelector = "a[class*='SuperfishMegaMenu-topLink'][title='" + linkText + "']";
        driver.findElement(By.cssSelector(menuSelector)).click();
        driver.findElement(By.cssSelector(menuSelector)).click();
    }
}
