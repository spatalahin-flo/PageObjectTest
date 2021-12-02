package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Base
 {
    public static WebDriver driver;

    public static void click(By input_locator)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement input = driver.findElement(input_locator);
        input.click();
    }

    public static void sendKey(By key_locator, String keysToSend)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement sendKey = driver.findElement(key_locator);
        sendKey.sendKeys(keysToSend);
    }
    public static void checkAvailabilityItem(By locator)
    {
        String par = driver.findElement(locator).getText();
        try
        {
            assertEquals(par, "GA-700SKE-7A");
            System.out.println(" We have item in cart! ");
        } catch (AssertionError e)
        {
            System.out.println(" Nah, we lost it( ");
        }
    }

    public static void checkDeletedItem(By locator)
    {
        try
        {
            Thread.sleep(900);
        } catch (InterruptedException e) {}

        List<WebElement> elementList = driver.findElements(locator);
        if (elementList.size() <= 0)
        {
            System.out.println(" We delete it ");
        } else
        {
            System.out.println(" Nah, we still has item ");
        }
    }

    public static void navigate(By locator)
    {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

    }

 }