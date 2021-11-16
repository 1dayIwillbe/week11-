package homework1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * https://opensource-demo.orangehrmlive.com/
 * ( Username : Admin | Password : admin123 )
 * Enter username
 * Enter password
 * Click login
 * Verify that the text “Welcome Paul”
 * After Paul one symbol there so click on the symbol for logout.
 * Verify the below text.
 * LOGIN Panel
 */

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
        String expectedText1 ="LOGIN Panel";
        String atcualText1= driver.findElement(By.id("logInPanelHeading")).getText();
        Assert.assertEquals("You are not logged out",expectedText1,atcualText1);
    }


    @After
    public void close() {
    closeBrowser();
    }

}
