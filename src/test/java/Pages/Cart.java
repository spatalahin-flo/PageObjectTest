package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Cart {
    WebDriver driver;


    public Cart(WebDriver driver) {
        this.driver = driver;
    }


    By CartItem = By.className("basket__item-title");
    By DeleteItem = By.xpath("/html/body/div[1]/div[1]/section[1]/div[2]/div/div[2]/div/div/div[2]/span");

public void CartItem() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.findElement(CartItem).getText();
}

    public void DeleteItem() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(DeleteItem).getText();
    }


}
