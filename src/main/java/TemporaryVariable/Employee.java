package main.java.TemporaryVariable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private Date hireDate;
    private boolean isSales;
    private boolean isDisabled;
    private double CostToCompany;
    private int targetAchieved;
    private String designation;

    private String paymentType;
    private String paymentCurrency;
    private double baseSalary;
    private double dollarRate;
    private double gbpRate;
    private double rupeeRate;
    private double commissionRate;

    private boolean IsEligibleForPerformanceReview() throws ParseException {
        boolean iseligible;
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = formatter.parse("07/01/2016");

        if (hireDate.before(date)) {
            iseligible = true;
        } else {
            iseligible = false;
        }
        return iseligible;
    }

    public double getSpecialIncentive() {
        double result;
        if (designation == "Manager")
            result = CostToCompany * 5 / 100;
        else {
            if (designation == "Sales Manager") result = CostToCompany * 2 / 100 + targetAchieved * 2000;
            else {
                if (isDisabled) {
                    result = CostToCompany * 10 / 100;
                } else {
                    if (yearOfService() < 1) {
                        result = (double) 5000;
                    } else result = CostToCompany * 1 / 100;
                }
            }
        }
        return result;
    }

    private int yearOfService() {
        long diff = hireDate.getTime() - new Date().getTime();
        long d = (1000 * 60 * 60 * 24 * 365);
        Integer years = Math.round(diff / d);
        Integer yearOfService = (int) years;
        return yearOfService;
    }

    public double calculateSalary() {
        double salary = 0;
        if (paymentType == "Base") {
            if (paymentCurrency == "Dollar") {
                salary = baseSalary * dollarRate;
            }

            if (paymentCurrency == "British Pound") {
                salary = baseSalary * gbpRate;
            }

            if (paymentCurrency == "Rupee") {
                salary = baseSalary * rupeeRate;
            }
        }

        if (paymentType == "BasePlusCommission") {
            if (paymentCurrency == "Dollar") {
                salary = baseSalary * (1 + commissionRate) * dollarRate;
            }

            if (paymentCurrency == "British Pound") {
                salary = baseSalary * (1 + commissionRate) * gbpRate;
            }

            if (paymentCurrency == "Rupee") {
                salary = baseSalary * (1 + commissionRate) * rupeeRate;
            }
        }
        return salary;
    }
}
