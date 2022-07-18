import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class TableTest {


    WebDriver wd;


    @BeforeMethod
    public void init(){
       wd = new ChromeDriver();
       wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    // get row 4 content
    public void tableTask1(){
        String text = wd.findElement(By.cssSelector("tr:nth-child(4)")).getText();
        wd.findElement(By.xpath("//tr[4]"));
        System.out.println(text);
    // check if there is text "Mexico" there
        Assert.assertTrue(text.contains("Mexico"));
    }

    @Test
    // print content of row3


    public void tableTest2(){
    // print amount of table rows
        //List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
        System.out.println(wd.findElements(By.xpath("//table[@id='customers']//tr")).size());
        //System.out.println(rows.size());
    // print amount of table columns
        System.out.println(wd.findElements(By.xpath("//table[@id='customers']//th")).size());
    // print content of last column
//        List<WebElement> lastCol = wd.findElements(By.cssSelector("td:last-child));
        List<WebElement> lastCol = wd.findElements(By.xpath("//table[@id='customers']//td[last()]"));
        for (WebElement el: lastCol) {
            System.out.println(el.getText());
        }
    // print number of row with name "Philip Cramer"
        List<WebElement> list = wd.findElements(By.xpath("//table[@id='customers']//td[2]"));
        for (WebElement el: list) {
        if(el.getText().contains("Philip Cramer")) System.out.println(list.indexOf(el) + 2);
        }
    }

//    @Test
//    public void tableTestCss(){
//        WebElement element = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"));
//        String text = element.getText();
//        System.out.println(text);
//        Assert.assertEquals(text, "Canada");
//        Assert.assertTrue(text.contains("nad"));
//    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}
