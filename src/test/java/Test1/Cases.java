package Test1;

import java.time.Duration;

import Pages.Cart;
import Pages.OpenCart;
import Pages.SearchField;
import Pages.SelectItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class Cases {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.g-store.ru/");

        SearchField search = new SearchField(driver);
        SelectItem select = new SelectItem(driver);
        OpenCart open = new OpenCart(driver);
        Cart ct = new Cart(driver);


           search.search();

           select.setSelectItem();
           select.AddToCart();

           open.OpenCart();

           ct.CartItem();
           ct.DeleteItem();

    }
}
