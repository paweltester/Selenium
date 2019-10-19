import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWSelenium {
    WebDriver driver; //przegladarka
    ChromeOptions options; //instrukcje dla przegladarki

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tester\\Desktop\\_555\\chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("start-maximized");

    }

    @Test
    public void OtwarciePrzegladarki(){
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void Zamknij(){

        driver.close();
    }
}
