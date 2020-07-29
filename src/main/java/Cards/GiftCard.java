package Cards;

import Retailers.IChargeable;

public class GiftCard implements IChargeable {

    private String vendor;
    private int balance;
    private double cardCost;

    public GiftCard(String vendor, int balance, double cardCost){
        this.vendor = vendor;
        this.balance = balance;
        this.cardCost = cardCost;
    }

    public void applyChargeAmount(double transactionAmount){
       this.balance -= transactionAmount;
    }

    public double getChargeAmount(double transactionAmount){
        return this.cardCost * transactionAmount;
    }

}
