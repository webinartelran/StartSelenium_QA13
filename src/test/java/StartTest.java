import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartTest {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
    wd = new ChromeDriver();
//    wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
    wd
            .navigate()
            .to("https://contacts-app.tobbymarshall815.vercel.app/home");
// chain
    // wd.navigate().forward()
    // wd.navigate().back()
    // wd.navigate().refresh()

    }

    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println(elements.size());
        // strategies
        element = wd.findElement(By.linkText("ABOUT")); // old school
        element = wd.findElement(By.partialLinkText("ABO")); // old school
        element = wd.findElement(By.id("root"));
        element = wd.findElement(By.className("container"));

        // cssSelector
            // by tagName
        element = wd.findElement(By.cssSelector("div"));
            // by className
        element = wd.findElement(By.cssSelector(".container"));
            // by ID
        element = wd.findElement(By.cssSelector("#root"));
            // by attribute
        element = wd.findElement(By.cssSelector("[placeholder='Email']"));
            // by attribute starts with
        element = wd.findElement(By.cssSelector("[href^='Ho']"));
            // by attribute ends with
        element = wd.findElement(By.cssSelector("[href$='out']"));
            // by attribute contains
        element = wd.findElement(By.cssSelector("[href*='ogi']"));

        // xPath selectors:
        // by tagName
        element = wd.findElement(By.xpath("//div"));
        // by className
        element = wd.findElement(By.xpath("//*[@class='container']"));
        // by ID
        element = wd.findElement(By.xpath("//*[@id='root']"));
        // by attribute
        element = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        // by attribute starts with
        element = wd.findElement(By.xpath("//*[starts-with(@href,'/Ho')]"));
        // by attribute ends with - unavailable
            //element = wd.findElement(By.cssSelector("[href$='out']"));
        // by attribute contains
        element = wd.findElement(By.xpath("//*[contains(@href,'ogi')]"));
        
    }
    
    @Test
    public void testPassword(){

    }

    @AfterMethod
    public void postCondition(){

        // wd.close();
        wd.quit();

    }
}
