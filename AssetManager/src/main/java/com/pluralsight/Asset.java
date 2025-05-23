package com.pluralsight;

public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    //---Constructor------------------------------------------

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    //---Getter and Setter-------------------------------------


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dataAcquired) {
        this.dateAcquired = dataAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }


    /// --- Methods------------------------------------------------

    public double getValue(){
        return this.originalCost;
    }
}
