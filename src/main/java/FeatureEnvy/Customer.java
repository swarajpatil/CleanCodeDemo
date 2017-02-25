package main.java.FeatureEnvy;

public class Customer {

    private String name;
    private DataPlan plan;
    private double dataUsage;

    public Customer(String Name, DataPlan dataPlan) {
        name = Name;
        plan = dataPlan;
    }

    public void updateUsage(double data) {
        dataUsage += data;
    }

    public void printInternetBill() {
        System.out.println("Customer Name: " + name);

        System.out.println("Total Usage: " + dataUsage + " MB");

        double billAmount = plan.getBillAmount(dataUsage);

        // add service tax
        billAmount += billAmount * 0.12;
        System.out.println("Total Amount: " + billAmount);
    }

}
