package Pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Cart {
    WebDriver driver;


    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    By checkItem = By.xpath("//a[contains(text(), 'GA-700SKE-7A')]");
    By deleteItem = By.className("basket__item-remove");
    By checkVoid = By.xpath("//div[contains(text(), 'ваша корзина пуста')]");

    @Test
    public void CheckItem() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(checkItem).getText();
        System.out.println("We already have watch!!!");
    }


    @Test
    public void scrollTo() {
        WebElement element = driver.findElement(By.xpath("//div[contains(text(), 'Скидки и бонусы')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    @Test
    public void DeleteItem() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(deleteItem).click();
    }

    @Test
    public void CheckVoid() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(checkVoid);
        System.out.println("We removed it!!!");
    }

}
