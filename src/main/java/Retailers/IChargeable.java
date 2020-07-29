package Retailers;

import Cards.PaymentCard;

public interface IChargeable {
    double getChargeAmount(double transactionAmount);
    void applyChargeAmount(double transactionAmount);
}
