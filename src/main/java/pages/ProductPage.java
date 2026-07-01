package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    public static WebDriver driver;
    //Define locators to the Items to be Added to the Cart.
    private static By quartzelectricheater = By.xpath("//*[@id=\"carousel-42-item-1\"]/article/a");
    private static By laptopbag = By.xpath("//*[@id=\"carousel-68-item-4\"]/article/a");

    public ProductPage(WebDriver driver){this.driver =driver;}
//Actions
    public void clickquartzelectricheater(){driver.findElement(quartzelectricheater).click();}
    public void clicklaptopbag(){driver.findElement(laptopbag).click();}

}


