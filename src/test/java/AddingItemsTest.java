import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingItemsTest  extends Setup{
    @Test
    public void  testOne() throws InterruptedException {

        home.addMoreItems();
        Thread.sleep(200);
         home.buyItems();






        var order =home.compeleteOrder();


       // MakeingOrder.less();
//         order.geturl();
//        Assert.assertEquals("https://demo.guru99.com/payment-gateway/process_purchasetoy.php" , order,"this is not the correct link for the page ");
//       order.entercardNumber();
    }



}
