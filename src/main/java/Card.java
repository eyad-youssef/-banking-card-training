import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.ArrayList;

public class Card {
    private WebDriver driver;

    public Card(WebDriver driver){
        this.driver= driver;
    }



    public  void goingtoPage(){
      //  driver.findElement(By.xpath("/html/body/header/div/nav/a[2]")).click();
    driver.get("https://demo.guru99.com/payment-gateway/cardnumber.php");
        }





























//    public  void switchTab(){
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//       driver.switchTo().window(tabs.get(1));
//       String text= driver.findElement(By.xpath("/html/body/section/div/h4[1]")).getText();
//        System.out.println(text);
//        driver.switchTo().window(tabs.get(0));
//
//
//  }



}
