package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Base
 {

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By checkItem = By.xpath("//a[contains(text(), 'GA-700SKE-7A')]");
    By deleteItem = By.className("basket__item-remove");
    By scrollToDeleteBtn = By.xpath("//div[contains(text(), 'Скидки и бонусы')]");

    public void checkAvailabilityItem()
    {
        Base.checkAvailabilityItem(checkItem);
    }

    public void scrollToDeleteBtn()
    {
        Base.navigate(scrollToDeleteBtn);
    }

    public void deleteItem()
    {
        Base.click(deleteItem);
    }

    public void checkDeletedItem()
    {
        Base.checkDeletedItem(checkItem);
    }

 }