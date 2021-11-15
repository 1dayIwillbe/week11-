package homework2;

import homework1.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xcart extends BaseClass {
    @Before
    public void page(){
        openBrowser("https://demostore.x-cart.com/shipping");

    }

    @Test
    public void test(){
       WebElement one = driver.findElement(By.xpath("//a[@href=' ']"));
       one.click();
    }
}
