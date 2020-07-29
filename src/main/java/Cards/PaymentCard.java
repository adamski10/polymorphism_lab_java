package Cards;

import Retailers.IChargeable;

import java.util.Calendar;

public abstract class PaymentCard implements IChargeable {

    protected double cardCost;
    protected String cardType;
    protected int cardNumber;
    protected String expirationDate;


    public PaymentCard(double cardCost, String cardType, int cardNumber, String expirationDate){
        this.cardCost = cardCost;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }



    public double getCardCost() {
        return this.cardCost;
    }

    public String getCardType() {
        return this.cardType;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }


}
