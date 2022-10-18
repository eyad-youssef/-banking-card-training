import org.testng.annotations.Test;

public class CardInfoTest extends Setup{


@Test
    public  void thirdTest() throws InterruptedException {
    Card  card = home.getCardData();
    card.goingtoPage();
//    Thread.sleep(100);
//    card.switchTab();
}
}
