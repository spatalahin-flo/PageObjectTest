package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SearchFieldPage extends Base
 {

    public SearchFieldPage(WebDriver driver)
    {
     this.driver = driver;
    }

    By searchbar = By.name("query");
    By alertCookie = By.className("cookie-alert__close");
    By searchBtn = By.xpath(("//button[contains(text(), 'Найти')]"));
    By popup = By.className("popup__close");

    public void closeAlertCookie()
    {
        Base.click(alertCookie);
    }

    public void closePopup()
    {
        try
        {
        Base.click(popup);
        }
        catch(NoSuchElementException e)
        {}
    }

    public void enterItemInSearchField(String ItemForSearch)
    {
        Base.sendKey(searchbar, ItemForSearch);
    }

    public void pushSearchBtn()
    {
        Base.click(searchBtn);
    }

}