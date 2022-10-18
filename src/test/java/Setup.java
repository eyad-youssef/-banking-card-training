import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Setup {
    protected HomePage home;
    private   WebDriver driver;

 @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();/*FirefoxDriver*/
        driver = new ChromeDriver();
        driver.manage().window().maximize();
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,-350)", "");

        home = new HomePage(driver);

        gohome();
        driver.getCurrentUrl();




    }
    @BeforeMethod
    public  void gohome(){driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");}
   // @AfterClass
    //public  void end(){driver.quit();}

}
