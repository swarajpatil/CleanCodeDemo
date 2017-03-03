package main.java.MagicNumbers;

public class IncomeTax {


    public double calculateIncomeTax(double totalIncome, Investments investments) {
        double taxableIncome = totalIncome - calculateTaxExemptionAmount(investments);

        if (taxableIncome > 1000000)
            return taxableIncome * 0.3;

        if (taxableIncome > 500000)
            return taxableIncome * 0.2;

        if (taxableIncome > 250000)
            return taxableIncome * 0.1;

        return 0;
    }

    public double calculateTaxExemptionAmount(Investments investments) {
        double totalExemption = 0;
        //80 C Deductions
        totalExemption += investments.get80CSectionInvestment() < 150000 ? investments.get80CSectionInvestment() : 150000;

        //HRA Expenses
        totalExemption += investments.hraExpenses() < 96000 ? investments.hraExpenses() : 96000;

        //Medical Expenses
        totalExemption += investments.medicalExpenses() < 15000 ? investments.medicalExpenses() : 15000;

        //Home Loan Interest Paid
        totalExemption += investments.homeLoanInrestPaid() < 200000 ? investments.homeLoanInrestPaid() : 200000;

        return totalExemption;
    }
}