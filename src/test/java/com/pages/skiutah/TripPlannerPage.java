package com.pages.skiutah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TripPlannerPage {

    WebDriver driver;

    public TripPlannerPage(WebDriver ldriver){
        this.driver=ldriver;
    }

    @FindBy(how = How.NAME, using = "filter-form-submit")
    public WebElement okButton;

    public void printSearchResults(){
       By searchResults = By.cssSelector("div[class='ListingResults-item']");
        List<WebElement> Results = driver.findElements(searchResults);
        for (WebElement result : Results){
            System.out.println(result.getText());
        }
    }
    public void selectWhat(String itemToSelect){
        By whatElement = By.xpath("//*[@id='listing-page']/div[1]/div/form/div/div[1]/div[1]/div/div/select" +
                              "/option[contains(text(), '" + itemToSelect + "')]");
        driver.findElement(whatElement).click();
    }

    public void selectSubCategory(String itemToSelect) {
        By selectElement = By.name("filter-sub-category-select");
        Select subCategoryDropdown = new Select(driver.findElement(selectElement));
        subCategoryDropdown.selectByVisibleText(itemToSelect);
        System.out.println(subCategoryDropdown.getFirstSelectedOption().getText());
    }

    public void selectByResort(String itemToSelect) {
        By selectElement = By.name("filter-resort-select");
        Select byResortDropdown = new Select(driver.findElement(selectElement));
        byResortDropdown.selectByVisibleText(itemToSelect);
        System.out.println(byResortDropdown.getFirstSelectedOption().getText());
    }
}
