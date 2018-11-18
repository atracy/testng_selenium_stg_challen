package com.tests.skiutah;

import Helper.BrowserFactory;
import com.pages.skiutah.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Challenge1OpenSkiUtah {

    WebDriver driver;
    @BeforeTest
    public void SetUp(){
        this.driver = BrowserFactory.startBrowser("chrome", "http://skiutah.com");
    }

    //Challenge 1
    @Test(priority=1, enabled = false)
    public void AutomationChallenge1(){
        System.out.println("Ski Utah Opened");
        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.checkPageTitle("Ski Utah | Utah Ski Resorts, Lift Tickets, Ski Passes, Maps & More! - Ski Utah");

    }

    //Challenge 2
    @Test(priority=2, enabled = false)
    //click on deals page
    public void AutomationChallenge2(){
        String navigateTo = "Deals";
        TopNavigation topNavigation = PageFactory.initElements(driver, TopNavigation .class);
        DealsPage dealsPage = PageFactory.initElements(driver, DealsPage.class);
        topNavigation.navigateTo(navigateTo);
        dealsPage.VerifyOnDealsPage();
    }

    //Challenge 3
    @Test(priority=3, enabled = false)
    //click on deals page
    public void AutomationChallenge3(){
        String navigateTo = "Deals";
        String subMenuNavigateTo = "All Deals";
        TopNavigation topNavigation = PageFactory.initElements(driver, TopNavigation .class);
        DealsPage dealsPage = PageFactory.initElements(driver, DealsPage.class);
        topNavigation.navigateToSubMenu(navigateTo, subMenuNavigateTo);
        dealsPage.VerifyOnDealsPage();
    }

    //Challenge 4 - Compare Times to get to resort
    @Test(priority=4, enabled = false)
    //click on deals page
    public void AutomationChallenge4(){
        String navigateTo = "Resorts & Snow";
        String subMenuNavigateTo = "Resort Comparison";
        TopNavigation topNavigation = PageFactory.initElements(driver, TopNavigation .class);
        ResortComparisonPage resortComparisonPage = PageFactory.initElements(driver, ResortComparisonPage.class);
        topNavigation.navigateToSubMenu(navigateTo, subMenuNavigateTo);
        resortComparisonPage.selectComparisons(1);
        System.out.println(resortComparisonPage.getMilesToAirport("Alta Ski Area"));
    }

    //Challenge 5 - Use Search and Get Info
    @Test(priority=5)
    //click on deals page
    public void AutomationChallenge5(){
        driver.get("http://skiutah.com/members/listing");
        TripPlannerPage tripPlannerPage = PageFactory.initElements(driver, TripPlannerPage.class);
        tripPlannerPage.selectWhat("Sponsor");
        tripPlannerPage.selectSubCategory("Sponsor");
        tripPlannerPage.selectByResort("Snowbird");
        tripPlannerPage.okButton.click();
        tripPlannerPage.printSearchResults();


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
