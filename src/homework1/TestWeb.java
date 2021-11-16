
package homework1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestWeb extends BaseClass {
    @Before
    public void start(){
        openBrowser("https://demostore.x-cart.com/shipping");
    }

    @Test
    public void main(){
        driver.findElement(By.xpath("//span[contains(text(),'Fashion')]")).click();
        driver.findElement(By.xpath("//a[@title='Beauty & Health'")).click();
        driver.findElement(By.id("logo")).click();

    }



}
