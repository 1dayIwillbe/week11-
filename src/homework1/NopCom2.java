package homework1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDateTime;

/**Navigate to website "https://demo.nopcommerce.com/"
  *  Click on the register link.
  *  Fill in all the fields.
  *  Click on the register button.
  *  Verify that the user registered successfully.
* */


public class NopCom2 extends BaseClass {
@Before
    public void openWeb(){
    String baseUrl = "https://demo.nopcommerce.com/";
    openBrowser(baseUrl);

}
@Test
    public void one(){
    LocalDateTime now = LocalDateTime.now();
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("gender-male")).click();   ////input[@id='gender-male']
    driver.findElement(By.id("FirstName")).sendKeys("Jignesh");
    driver.findElement(By.id("LastName")).sendKeys("Patel");
    Select day = new Select(driver.findElement(By.name("DateOfBirthDay"))); ////select[@name='DateOfBirthDay']
    day.selectByVisibleText("12");
    Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
    month.selectByVisibleText("December");
    Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
    year.selectByVisibleText("1968");
    driver.findElement(By.id("Email")).sendKeys("hello1"+now.getSecond()+"@gmail.com");
    driver.findElement(By.id("Company")).sendKeys("Prime Testing co.");
    WebElement chkBox = driver.findElement(By.id("Newsletter"));
    chkBox.click();
    driver.findElement(By.id("Password")).sendKeys("12345678@");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678@");
    driver.findElement(By.id("register-button")).click();
    String expectedResult = "Your registration completed";
    String actualResult = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
    Assert.assertEquals("You are not registered",expectedResult,actualResult);
}

}
