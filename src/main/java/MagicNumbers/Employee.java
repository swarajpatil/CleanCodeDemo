package main.java.MagicNumbers;


public class Employee {

    Investments investments = new Investments();
    private double totalAnualIncome;

    public double incomeTax() {
        IncomeTax taxCalculator = new IncomeTax();
        return taxCalculator.calculateIncomeTax(totalAnualIncome, investments);
    }

    public void setTotalAnualIncome(double totalAnualIncome) {
        this.totalAnualIncome = totalAnualIncome;
    }
}
