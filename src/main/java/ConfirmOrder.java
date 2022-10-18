import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class ConfirmOrder {


    private WebDriver driver;

    public ConfirmOrder(WebDriver driver) {
        this.driver = driver;

    }
    public  void goingtoPage(){ driver.get("https://demo.guru99.com/payment-gateway/process_purchasetoy.php");}


    public void entercardNumber() {
      WebElement number= driver.findElement( RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("/html/body/section/div/form/div[2]/div/div[3]/h4")));
        //driver.findElement(By.id("\"card_nmuber\"")).sendKeys("1234123412345858");
        number.sendKeys("1123456789123456789");


    }


    public void expirationMonth() {

        Select month= new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("05");

    }
    public void expirationYear() {

        Select year= new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("2027");

    }
    public void enterCVVcode() {
        driver.findElement(By.xpath("//*[@id=\"cvv_code\"]")).sendKeys("353");
    }

    public void pay(){
        driver.findElement(By.xpath("/html/body/section/div/form/div[2]/div/ul/li/input")).click();
    }

//public void less(){
//    WebElement number= driver.findElement( RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("/html/body/section/div/form/div[2]/div/div[3]/h4")));
//    //driver.findElement(By.id("\"card_nmuber\"")).sendKeys("1234123412345858");
//   // number.sendKeys("12341234123458");
//        String len = number.getText();
//        if (len.length()<16){
//            driver.switchTo().alert().accept();
//        }
//}

public  String  firstCheck(){
         return driver.findElement(By.xpath("/html/body/section/div/div/h2")).getText();

}
public  String secondCheck(){
    return
            driver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr[1]/td[2]/h3")).getText();

}


    public void geturl() {
        String link = driver.getCurrentUrl();

        System.out.println(link);
    }


}
