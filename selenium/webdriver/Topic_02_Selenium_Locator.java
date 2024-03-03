package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Selenium_Locator {
    WebDriver driver;

    @BeforeClass
    public void initialBrowser() {
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/register");
    }

    @Test
    public void TC_01_ID() {
        driver.findElement(By.id("small-searchterms")).sendKeys("Converse");

    }

    @Test
    public void TC_02_Class() {
        driver.findElement(By.className("register-next-step-button")).click();

    }
    @Test
    public void TC_03_Name() {
        driver.findElement(By.name("Email")).sendKeys("anhtp.ous");

    }
    @Test
    public void TC_04_LinkText() {
        driver.findElement(By.linkText("Orders"));
        driver.findElement(By.linkText("Contact us"));


    }
    @Test
    public void TC_05_PartialLinkText() {
        driver.findElement(By.partialLinkText("viewed"));
        driver.findElement(By.partialLinkText("Conditions"));
        driver.findElement(By.partialLinkText("Shipping & returns"));


    }
    @Test
    public void TC_06_TagName() {
        driver.findElements(By.tagName("button"));
        driver.findElements(By.tagName("input"));


    }
    @Test
    public void TC_07_Css_ID() {
        driver.findElement(By.cssSelector("input#Password"));
        driver.findElement(By.cssSelector("#Password"));
        driver.findElement(By.cssSelector("input[id='Password']"));
    }
        @Test
        public void TC_07_Css_Class() {

        driver.findElement(By.cssSelector("button.search-box-button"));
        driver.findElement(By.cssSelector("button[class='button-1 search-box-button']"));

    }
    @Test
    public void TC_07_Css_Name() {
        driver.findElement(By.cssSelector("input[name='LastName']"));
    }
    @Test
    public void TC_07_Css_LinkText() {
        driver.findElement(By.cssSelector("span[class='wishlist-label']"));
    }


    @Test
    public void TC_07_Css_PartialLinkText() {
        driver.findElement(By.cssSelector("a[href*= 'register?']"));
    }


    @Test
    public void TC_07_Css_TagName() {
        driver.findElements(By.cssSelector("input"));
        driver.findElements(By.cssSelector("a"));
    }




    @Test
    public void TC_08_Xpath_ID() {
        driver.findElements(By.xpath("//input[@id='small-searchterms']"));
        driver.findElements(By.xpath("//input[@id='FirstName']"));
        driver.findElements(By.xpath("//input[@id='ConfirmPassword']"));

    }
    @Test
    public void TC_08_Xpath_Class() {
        driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
        driver.findElement(By.xpath("//button[contains(@class,'register-next-step-button')]"));

    }

    @Test
    public void TC_08_Xpath_Name() {
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        driver.findElement(By.xpath("//input[@name='Company']"));

    }
    @Test
    public void TC_08_Xpath_LinkText() {
        driver.findElement(By.xpath("//a[text()='About us']"));

    }
    @Test
    public void TC_08_Xpath_PartialLinkText() {
        driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));

    }
    @Test
    public void TC_08_Xpath_TagName() {
        driver.findElements(By.xpath("//button"));
        driver.findElements(By.xpath("//input"));

    }



}