import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderingTest  extends Setup{

    @Test
    public  void ordering(){
        var MakeingOrder = home.compeleteOrder();


        MakeingOrder.goingtoPage();
        MakeingOrder.entercardNumber();
        MakeingOrder.expirationMonth();
        MakeingOrder.expirationYear();
        MakeingOrder.enterCVVcode();
        MakeingOrder.pay();


        String header = MakeingOrder.firstCheck();
        Assert.assertEquals("Payment successfull!", header, "this isn't right ");

        String   secondheader= MakeingOrder.secondCheck();
        int length =secondheader.length();
        Assert.assertEquals(6, length,"this isn't right ");

    }
}
