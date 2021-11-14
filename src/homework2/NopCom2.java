package homework2;

import homework1.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 */


public class NopCom2 extends BaseClass {
@Before
    public void openWeb(){
    String baseUrl = "https://demo.nopcommerce.com/";
    openBrowser(baseUrl);

}
@Test
    public void one(){
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("gender-male")).click();   ////input[@id='gender-male']
    driver.findElement(By.id("FirstName")).sendKeys("Jignesh");
    driver.findElement(By.id("LastName")).sendKeys("Patel");
    Select day = new Select(driver.findElement(By.name("DateOfBirthDay"))); ////select[@name='DateOfBirthDay']
    day.selectByVisibleText("31");
    Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
    month.selectByVisibleText("December");
    Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
    year.selectByVisibleText("1978");
    driver.findElement(By.id("Email")).sendKeys("hello@gmail.com");
    driver.findElement(By.id("Company")).sendKeys("Prime Testing co.");
    WebElement chkBox = driver.findElement(By.id("Newsletter"));
    chkBox.click();
    driver.findElement(By.id("Password")).sendKeys("12345678@");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678@");
    driver.findElement(By.id("register-button")).click();

}

}
