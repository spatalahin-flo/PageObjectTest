package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectItemAndOpenCartPage extends Base
 {

    public SelectItemAndOpenCartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By selectItem = By.xpath("//a[contains(text(), 'GA-700SKE-7A')]");
    By addToCart = By.xpath("//button[contains(text(), 'Купить')]");
    By iconCart = By.className("incart__btns-cart");
    By scrollToElement = By.xpath("//span[contains(text(), 'фильтр')]");
    By scrollToCart = By.xpath("//span[contains(text(), 'К сравнению')]");

    public void scrollMakingElementVisible()
    {
        Base.navigate(scrollToElement);
    }

    public void pushOnSelectedItem()
    {
        Base.click(selectItem);
    }

    public void scrollToCart()
    {
        Base.navigate(scrollToCart);
    }

    public void addToCart()
    {
        Base.click(addToCart);
    }

    public void clickOnIconCart()
    {
        Base.click(iconCart);
    }

 }

