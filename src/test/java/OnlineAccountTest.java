import Cards.CreditCard;
//import Cards.DebitCard;
import Cards.GiftCard;
import Retailers.OnlineAccount;
import Retailers.ReportingSoftware;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {

    OnlineAccount onlineAccount1;
    ReportingSoftware reportingSoftware;
    CreditCard creditCard;
//    DebitCard debitCard;
    GiftCard giftCard;

    @Before
    public void before() {
        onlineAccount1 = new OnlineAccount("Jimmy");
        creditCard = new CreditCard(0.02, "Credit card", 22334455, "01/01/2022", 0.05, 2000.00);

    }

    @Test
    public void canChargeCustomer(){
        onlineAccount1.chargeCustomer(100.00, creditCard);
        assertEquals(1900.00, creditCard.getBalance(), 0.01);
    }


}
