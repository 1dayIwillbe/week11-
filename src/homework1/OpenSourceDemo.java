package homework1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class OpenSourceDemo extends BaseClass {
    @Before
    public void open() {
        openBrowser("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void test1() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        String expectedText = "Welcome";
        String atcualText = driver.findElement(By.id("welcome")).getText();
        if (atcualText.contains(expectedText)) expectedText = atcualText;
        Assert.assertEquals("You are not logedin ", atcualText, expectedText);
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }


    @After
    public void close() {

    }

}
