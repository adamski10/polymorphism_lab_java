import Cards.CreditCard;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    
    private CreditCard creditCard;

    
    @Before
    public void before() {
        creditCard = new CreditCard(0.02, "Credit card", 22334455, "01/01/2022", 0.05, 2000.00);
    }

    @Test
    public void canGetExpirationDate() {
        assertEquals("01/01/2022", creditCard.getExpirationDate());
    }
    
    @Test public void canGetCardNumber(){
        assertEquals(22334455, creditCard.getCardNumber());
    }
    
    @Test
    public void canGetCardType(){
        assertEquals("Credit card", creditCard.getCardType());
    }
    
    @Test
    public void canGetCardCost() {
        assertEquals(0.02, creditCard.getCardCost(), 0.01);
    }

    @Test
    public void canGetRiskMultiplier(){
        assertEquals(0.05, creditCard.getRiskMultiplier(), 0.01);
    }

    @Test
    public void canGetChargeAmount(){
        assertEquals(10, creditCard.getChargeAmount(500), 0.01 );

    }

    @Test
    public void canApplyChargeAmount(){
        creditCard.applyChargeAmount(500);
        assertEquals(1500.00, creditCard.getBalance(), 0.01);
    }

}
