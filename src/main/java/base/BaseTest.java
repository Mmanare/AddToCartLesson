package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.takealot.com/3-set-laptop-bag-black/PLID73915566");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
    Thread.sleep(1000);

    }

}