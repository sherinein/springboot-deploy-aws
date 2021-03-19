package com.cts.renibuilders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class ReniBuildersApplicationSeleniumTest {
    WebDriver driver;

    @BeforeTest
    public void testBeforeTest() {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
        System.out.println("driver loaded");
        driver.get("http://localhost:8090");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("hello");
    }

    @Test(priority=1 )
    public void testWhetherSearchApartmentIsLoaded() {
        WebElement customerName = driver.findElement(By.id("customerName"));
        WebElement mobileNo = driver.findElement(By.id("mobileNo"));
        WebElement emailId = driver.findElement(By.id("emailId"));
        WebElement city = driver.findElement(By.id("city"));
        System.out.println("before property click");
       // WebElement propertyType = By.name("propertyType").findElement(driver);
        WebElement propertyTypeR1=driver.findElement(By.id("r1"));
        WebElement propertyTypeR2=driver.findElement(By.id("r2"));
        propertyTypeR1.click();
        System.out.println("property click");
        customerName.sendKeys("Nirmala");
        mobileNo.sendKeys("9505962345");
        emailId.sendKeys("athi@gmail.com");
        city.sendKeys("Chennai");
        propertyTypeR1.sendKeys("1 BHK");
        System.out.println("all data entered");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        System.out.println("Search Apartment Submitted Successfully");
        driver.navigate().back();
    }
    @Test(priority=2 )
    public void testWhetherCustomerNameIsEmpty() {
        WebElement customerName = driver.findElement(By.id("customerName"));
        WebElement mobileNo = driver.findElement(By.id("mobileNo"));
        WebElement emailId = driver.findElement(By.id("emailId"));
        WebElement city = driver.findElement(By.id("city"));
        System.out.println("before property click");
        // WebElement propertyType = By.name("propertyType").findElement(driver);
        WebElement propertyTypeR1=driver.findElement(By.id("r1"));
        WebElement propertyTypeR2=driver.findElement(By.id("r2"));
        propertyTypeR1.click();
        System.out.println("property click");
        customerName.clear();
        customerName.sendKeys(" ");
        mobileNo.sendKeys("9505962345");
        emailId.sendKeys("athi@gmail.com");
        city.sendKeys("Chennai");
        propertyTypeR1.sendKeys("1 BHK");
        System.out.println("all data entered");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        System.out.println("Search Apartment Submitted Successfully");
        driver.navigate().back();
    }
    @Test(priority=3 )
    public void testWhetherCityIsNotValid() {
        WebElement customerName = driver.findElement(By.id("customerName"));
        WebElement mobileNo = driver.findElement(By.id("mobileNo"));
        WebElement emailId = driver.findElement(By.id("emailId"));
        WebElement city = driver.findElement(By.id("city"));
        System.out.println("before property click");
        // WebElement propertyType = By.name("propertyType").findElement(driver);
        WebElement propertyTypeR1=driver.findElement(By.id("r1"));
        WebElement propertyTypeR2=driver.findElement(By.id("r2"));
        propertyTypeR1.click();
        System.out.println("property click");
        customerName.sendKeys("Nirmala");
        mobileNo.sendKeys("9505962345");
        emailId.sendKeys("athi@gmail.com");
        city.sendKeys("Bangalore");
        propertyTypeR1.sendKeys("1 BHK");
        System.out.println("all data entered");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        System.out.println("Search Apartment Submitted Successfully");
        driver.navigate().back();
    }
    @AfterTest
    public void afterTest() {
        System.out.println("hi");
        driver.close();
    }
}