package Retailers;

import java.util.ArrayList;

public class ReportingSoftware {

    private ArrayList<Double> chargesList;

    public ReportingSoftware() {
        this.chargesList = new ArrayList<Double>();
    }

    public ArrayList<Double> getChargesList() {
        return this.chargesList;
    }

    public void addToList(Double chargeAmount){
        this.chargesList.add(chargeAmount);
    }

    public Integer getSize(){
        return this.chargesList.size();
    }

}
