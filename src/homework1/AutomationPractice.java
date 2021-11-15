package homework1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class AutomationPractice extends BaseClass {
    @Before
    public void page() {
        openBrowser("http://automationpractice.com/index.php");

    }

    @Test
    public void test() {
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("patel123@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("123456@");
        driver.findElement(By.id("SubmitLogin")).click();
        String expectedResult = "There is 1 error";
        String actualResult = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]")).getText();
        Assert.assertEquals("You are on login page", expectedResult, actualResult);

    }
}
