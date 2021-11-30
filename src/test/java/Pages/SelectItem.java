package Pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SelectItem extends base {

    WebDriver driver;

    public SelectItem(WebDriver driver) {
        this.driver = driver;
    }

    By selectItem = By.xpath("//*[@id=\"bx_3329384694_746065\"]/a[1]/img");
    By addToCart = By.xpath("//button[contains(text(), 'Купить')]");

    @Test
    public void setSelectItem() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(selectItem).click();
    }


    @Test
    public void scrollTo() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'К сравнению')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }


    @Test
    public void AddToCart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(addToCart).click();
        }
}

