package homework1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Navigate to google https://www.google.com/
 * In homework1.Google search type "demo nopCommerce store" and click search
 * Click on the link "nopCommerce demo store"
 * Click on Computers and Verify that the user successfully navigated to the Computers page.
 * Navigate to google https://www.google.com/
 * In homework1.Google search type "demo nopCommerce store" and click search
 * Click on the link "nopCommerce demo store"
 * Click on Electronics and Verify that the user successfully navigated to the Electronics page.
 * Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
 */

public class Google extends BaseClass {


    @Before
    public void start() {
        String baseUrl = "https://www.google.com/";
        openBrowser(baseUrl);
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        WebElement one = driver.findElement(By.xpath("//input[@name='q']"));
        one.sendKeys("demo nopCommerce store", Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
    }

    @Test
    public void one() {

        driver.findElement(By.linkText("Computers")).click();
        String expectedResult = "Computers";
        WebElement two = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actuelResult = two.getText();
        Assert.assertEquals("You are not on Computer Page", expectedResult, actuelResult);
        stop();
        start();
        driver.findElement(By.linkText("Electronics")).click();
        String expectedResult1 = "Electronics";
        WebElement three = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actuelResult1 = three.getText();
        Assert.assertEquals("You are not on Electronics Page", expectedResult1, actuelResult1);
        stop();
        start();
        driver.findElement(By.linkText("Apparel")).click();
        String expectedResult2 = "Apparel";
        String actuelResult2 = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]")).getText();
        Assert.assertEquals("You are not on Apparel Page", expectedResult2, actuelResult2);
        stop();
        start();
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedResult3 = "Digital downloads";
        WebElement five = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actuelResult3 = five.getText();
        Assert.assertEquals("You are not on Digital downloads Page", expectedResult3, actuelResult3);
        stop();
        start();
        driver.findElement(By.linkText("Books")).click();
        String expectedResult4 = "Books";
        WebElement six = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actuelResult4 = six.getText();
        Assert.assertEquals("You are not on Books Page", expectedResult4, actuelResult4);
        stop();
        start();
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedResult5 = "Jewelry";
        WebElement seven = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actuelResult5 = seven.getText();
        Assert.assertEquals("You are not on Jewelry Page", expectedResult5, actuelResult5);
        stop();
        start();
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedResult6 = "Gift Cards";
        WebElement eight = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actuelResult6 = eight.getText();
        Assert.assertEquals("You are not on Gift Cards Page", expectedResult6, actuelResult6);

    }


    @After
    public void stop() {
         closeBrowser();
    }

}
