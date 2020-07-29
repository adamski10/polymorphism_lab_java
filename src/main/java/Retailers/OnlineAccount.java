package Retailers;

import Cards.CreditCard;
import Cards.PaymentCard;

import java.util.ArrayList;

public class OnlineAccount {

    private ReportingSoftware reportSoftware;
    private String name;

    public OnlineAccount(String name){
        this.name = name;
        this.reportSoftware = new ReportingSoftware();
    }



    public ReportingSoftware getReportSoftware() {
        return reportSoftware;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void chargeCustomer(double amount, IChargeable card) {
        double cost = card.getChargeAmount(amount);
        card.applyChargeAmount(amount);
        reportSoftware.addToList(cost);
    }
}
