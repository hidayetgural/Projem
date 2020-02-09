package com.CaseTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class TestAPP {
    protected WebDriver driver;
    @Before
    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hidayet\\IdeaProjects\\testinium\\ProjeTestinium\\TestCase\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Test
    public void ara()
    {
        driver.get("https://www.n11.com/");
        WebElement element= (WebElement) driver.findElements(By.id("searchData"));
        element.sendKeys("Bilgisayar");
        element.sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.getTitle().startsWith("Bilgisayar"));

         }
    @After

    public void tearDown() throws Exception{
        //driver.quit();
    }

}
