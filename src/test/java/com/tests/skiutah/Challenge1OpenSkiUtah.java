package com.tests.skiutah;

import Helper.BrowserFactory;
import com.pages.skiutah.DealsPage;
import com.pages.skiutah.HomePage;
import com.pages.skiutah.TopNavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

//    @Test(priority=1)
//    public void AutomationChallenge1(){
//        System.out.println("Ski Utah Opened");
//        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
//        homePage.checkPageTitle("Ski Utah | Utah Ski Resorts, Lift Tickets, Ski Passes, Maps & More! - Ski Utah");
//
//    }

    @Test(priority=2)
    //click on deals page
    public void AutomationChallenge2(){
        String navigateTo = "Deals";
        TopNavigation topNavigation = PageFactory.initElements(driver, TopNavigation .class);
        DealsPage dealsPage = PageFactory.initElements(driver, DealsPage.class);
        topNavigation.navigateTo(navigateTo);
        dealsPage.VerifyOnDealsPage();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
