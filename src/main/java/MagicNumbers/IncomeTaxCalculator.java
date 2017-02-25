package main.java.MagicNumbers;

public class IncomeTaxCalculator {

    public double calculateIncomeTax(double totalIncome, double investment) {
        double taxableIncome = totalIncome - investment;

        if (taxableIncome > 1000000)
            return taxableIncome * 0.3;

        if (taxableIncome > 500000)
            return taxableIncome * 0.2;

        if (taxableIncome > 250000)
            return taxableIncome * 0.1;

        return 0;
    }

    public double getAdditionalTaxBenefit(double totalIncome, double investment) {
        double taxableIncome = totalIncome - investment;

        if (taxableIncome > 250000 && taxableIncome < 500000)
            return 10000;

        if (taxableIncome > 500000 && taxableIncome < 1000000)
            return 5000;

        if (taxableIncome > 100000)
            return 0;

        return 0;
    }
}