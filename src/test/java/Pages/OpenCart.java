package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class OpenCart {
    WebDriver driver;


    public OpenCart(WebDriver driver) {
        this.driver = driver;
    }

    By OpenCart = By.className("incart__btns-cart");

    public void OpenCart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(OpenCart).click();
    }

}
