package Cards;

import java.util.Calendar;

public class CreditCard extends PaymentCard  {

    private double riskMultiplier;
    private double cardBalance;

    public CreditCard(double cardCost, String cardType, int cardNumber, String expirationDate, double riskMultiplier, double cardBalance){
        super(cardCost, cardType, cardNumber, expirationDate);
        this.riskMultiplier = riskMultiplier;
        this.cardBalance = cardBalance;
    }

    public double getRiskMultiplier() {
        return riskMultiplier;
    }

    public double getChargeAmount(double transactionAmount){
        return this.cardCost * transactionAmount;
    }

    public void applyChargeAmount(double transactionAmount){
        this.cardBalance -= transactionAmount;
    }

    public double getBalance() {
        return this.cardBalance;
    }
}
