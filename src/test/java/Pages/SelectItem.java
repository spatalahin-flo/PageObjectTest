package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class SelectItem {
    WebDriver driver;

    public SelectItem(WebDriver driver) {
        this.driver = driver;
    }

    By selectItem = By.xpath("/*[@id=\"bx_3329384694_746065\"]/a[1]/img");
    By AddToCart = By.xpath("//*[@id=\"bx_840233306_746065\"]/div[1]/div[1]/div[2]/div[6]/div[3]/form/button");



    public void setSelectItem() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", selectItem);
        driver.findElement(selectItem).click();
    }

    public void AddToCart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", AddToCart);
        driver.findElement(AddToCart).click();
    }

}
