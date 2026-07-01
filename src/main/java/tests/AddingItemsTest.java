package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ProductPage;

 public class AddingItemsTest extends BaseTest {
     @Test
    public void AddtoCart(){
        ProductPage productPage = new ProductPage(driver);
        productPage.clickquartzelectricheater();
    }
}
