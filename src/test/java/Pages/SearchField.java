package Pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SearchField {

    WebDriver driver;

    public SearchField(WebDriver driver) {
        this.driver=driver;
    }

    By searchbar = By.name("query");
    By deleteCookie = By.className("cookie-alert__close");

    @Test
    public void deleteCookie() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(deleteCookie).click();
    }

    @Test
    public void search() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(searchbar).sendKeys("GA-700SKE-7A" + "\n");
    }
}
