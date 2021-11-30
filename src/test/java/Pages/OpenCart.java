package Pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class OpenCart {
    WebDriver driver;


    public OpenCart(WebDriver driver) {
        this.driver = driver;
    }

    By openCart = By.className("incart__btns-cart");

    @Test
    public void OpenOurCart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(openCart).click();
    }

}
