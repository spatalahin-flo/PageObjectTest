package TestCases;
import Base.Base;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.time.Duration;
import Pages.CartPage;
import Pages.SearchFieldPage;
import Pages.SelectItemAndOpenCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTests extends Base
 {
             WebDriver driver = new ChromeDriver();
             SearchFieldPage search = new SearchFieldPage(driver);
             SelectItemAndOpenCartPage select = new SelectItemAndOpenCartPage(driver);
             CartPage cart = new CartPage(driver);

     @Before
     public void Beginning()
      {
               System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
               driver.get("https://www.g-store.ru/");
      }

     @Test
     public void Test()
     {
               search.closePopup();
               search.enterItemInSearchField(TestData.ItemForSearch);
               search.pushSearchBtn();
               search.closeAlertCookie();

               select.scrollMakingElementVisible();
               select.pushOnSelectedItem();
               select.scrollToCart();
               select.addToCart();
               select.clickOnIconCart();

               cart.checkAvailabilityItem();
               cart.scrollToDeleteBtn();
               cart.deleteItem();
               cart.checkDeletedItem();
      }

      @After
      public void Ending()
      {
              driver.quit();
      }

 }
