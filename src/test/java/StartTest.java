import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartTest {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
    wd = new ChromeDriver();
    // wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
    wd
            .navigate()
            .to("https://contacts-app.tobbymarshall815.vercel.app/home");
// chain

    }

    @Test
    public void testName(){

    }
    
    @Test
    public void testPassword(){

    }

    @AfterMethod
    public void postCondition(){

    }
}
