package homework1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MorningChallange extends BaseClass {
    @Before
    public void open() {
        openBrowser("https://www.amazon.co.uk/");
    }

    @Test
    public void test1() {

       driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Dell Laptop", Keys.ENTER);
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Dell') and @dir='auto']")).click();
        driver.manage().window().fullscreen();
        List<WebElement> products = driver.findElements(By.xpath("//img[@data-image-index]"));
        int numberOfProducts = products.size();
        System.out.println("Total number of products found on page :"+numberOfProducts);
        for (WebElement pro : products){
           System.out.println(pro.getAttribute("alt"));
        }
    }

    @After
    public void end(){
        closeBrowser();
    }

}
