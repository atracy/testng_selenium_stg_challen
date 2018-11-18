package com.pages.skiutah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ResortComparisonPage {

    WebDriver driver;

    public ResortComparisonPage(WebDriver ldriver){
        this.driver=ldriver;
    }

    //@FindBy(how = How.NAME, using = 'resort-feature-select')
    //private WebElement navigate_to(String Link_Text);

    public void selectComparisons(int itemToSelect){
        By selectElement = By.name("resort-feature-select");
        Select comparisonsDropdown = new Select(driver.findElement(selectElement));
        comparisonsDropdown.selectByIndex(itemToSelect);
        System.out.println(comparisonsDropdown.getFirstSelectedOption().getText());
    }

    public String getMilesToAirport(String ResortName){
        By milesToAirportElement = By.cssSelector("a[title='" + ResortName + "'] span[class='ResortComparison-value']");
        return driver.findElement(milesToAirportElement).getText();

    }

}
