package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_04_Xpath_Locator {
    WebDriver driver;

    @BeforeClass
    public void initialBrowser() {
        driver = new FirefoxDriver();
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void Resister_01_Empty_Data() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();

                Assert.assertEquals(driver.findElement(By.id("txtFirstname-error")).getText(),"Vui lòng nhập họ tên");


    }

    @Test
    public void Resister_02_Invalid_Email() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Tran Phuong Anh");
        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("123@@123@1234");
        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("123@@123@1234");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
        Assert.assertEquals(driver.findElement(By.id("txtEmail-error")).getText(),"Vui lòng nhập email hợp lệ");
        Assert.assertEquals(driver.findElement(By.id("txtCEmail-error")).getText(),"Email nhập lại không đúng");
    }


    @Test
    public void Resister_03_Incorrect_Confirm_Email() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Tran Phuong Anh");
        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("123@@123@34");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
        Assert.assertEquals(driver.findElement(By.id("txtCEmail-error")).getText(),"Email nhập lại không đúng");
    }

    @Test
    public void Resister_04_Invalid_Password() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Tran Phuong Anh");
        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
        Assert.assertEquals(driver.findElement(By.id("txtPassword-error")).getText(),"Mật khẩu phải có ít nhất 6 ký tự");
    }

    @Test
    public void Resister_05_Incorrect_Confirm_Password() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Tran Phuong Anh");
        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
        Assert.assertEquals(driver.findElement(By.id("txtCPassword-error")).getText(),"Mật khẩu phải có ít nhất 6 ký tự");
    }

    @Test
    public void Resister_06_Invalid_Phonenumber() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Tran Phuong Anh");
        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("09631749321456");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
        Assert.assertEquals(driver.findElement(By.id("txtPhone-error")).getText(),"Số điện thoại phải từ 10-11 số.");
    }
    @Test
    public void Resister_06_Invalid_Phonenumber_02() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Tran Phuong Anh");
        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("anhtp@1234");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("1234577785");
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();
        Assert.assertEquals(driver.findElement(By.id("txtPhone-error")).getText(),"Số điện thoại bắt đầu bằng: 09 - 03 - 012 - 016 - 018 - 019 - 088 - 03 - 05 - 07 - 08");
    }
}

