package com.pages.skiutah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TopNavigation {

    WebDriver driver;

    public TopNavigation(WebDriver ldriver){
        this.driver=ldriver;
    }

    public void navigateTo(String menu) {
        this.hoverMenu(menu);
        this.hoverMenu(menu);
    }

    public void hoverMenu(String menu) {
        By menuSelector = By.cssSelector("a[class*='SuperfishMegaMenu-topLink'][title='" + menu + "']");
        this.hover(menuSelector);
    }

    public void navigateToSubMenu(String menu, String subMenu){
        this.hoverMenu(menu);
        this.hover(By.linkText(subMenu));
    }

    private void hover(By menuItem){
        Actions action = new Actions(driver);
        WebElement Element = driver.findElement(menuItem);
        action.moveToElement(Element);
        action.click();
        action.perform();
    }
}
