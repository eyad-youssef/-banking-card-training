import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void addMoreItems() {
        WebElement list = driver.findElement(By.xpath("/html/body/section/div/form/div/div[4]/select"));
        Select selectedist = new Select(list);
        selectedist.selectByVisibleText("3");


    }

    public void buyItems() {
        driver.findElement(By.xpath("/html/body/section/div/form/div/div[8]/ul/li/input")).click();


    }

    public ConfirmOrder compeleteOrder() {
        return new ConfirmOrder(driver);
    }
    public  Card getCardData(){
        return  new Card(driver);
    }

}
