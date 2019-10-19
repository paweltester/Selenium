import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.partialLinkText;

public class TestWSelenium {
    WebDriver driver; //przegladarka
    ChromeOptions options; //instrukcje dla przegladarki

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tester\\Desktop\\_555\\chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void otwarciePrzegladarki(){

      //  driver.get("http://www.wp.pl");
    }

    @Test
    public void wyszukajLublin() {
        driver.get("http://www.google.pl");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Lublin");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);

        boolean i=true;
//        while(i){
//            if(driver.findElement(By.cssSelector("[href='https://pl.wikipedia.org/wiki/Lublin']")).isDisplayed()){
//                i=false;
//            }  else {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//        }
        driver.findElement(By.cssSelector("[href='https://pl.wikipedia.org/wiki/Lublin']")).click();
        System.out.println(driver.findElement(By.cssSelector(".firsttHeading")).getText());

        Assert.assertEquals(driver.findElement(By.cssSelector(".firsatHeading")).getText(), "Lublin");

    }

    @AfterMethod
    public void Zamknij(){

  //      driver.close();
    }
}
