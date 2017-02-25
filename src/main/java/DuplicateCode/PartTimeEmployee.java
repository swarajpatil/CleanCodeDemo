package main.java.DuplicateCode;

import java.util.Date;

class PartTimeEmployee {

    private double Basic;
    private double DA;
    private double TA;
    private double MA;
    private double mealVoucherAmount;
    private double PetrolExpenses;
    private double InternetExpenses;
    private double taxIncome;
    private Date hireDate;
    private boolean IsParentCovered;
    private int casualLeave;
    private int SickLeave;
    private int floatingLeave;
    private int leavesTaken;

    public double calculateIncomeTax() {
        double grosssalary = getGrosssalary();
        if (grosssalary * 12 > 250000 && grosssalary * 12 < 500000)
            return grosssalary * 0.1;
        if (grosssalary * 12 > 500000 && grosssalary * 12 < 1000000)
            return grosssalary * 0.2;
        if (grosssalary * 12 > 1000000)
            return grosssalary * 0.3;
        return 0;
    }

    private double getGrosssalary() {
        return (Basic + DA + TA + MA) - Basic * 12 / 100;
    }

    public double calculateInsuranceAmount() {
        double grosssalary = getGrosssalary();
        double insuranceamount = grosssalary * 1.5 + 2 * Basic;

        long diff = hireDate.getTime() - new Date().getTime();
        long d = (1000 * 60 * 60 * 24 * 365);
        Integer yearOfService = Math.round(diff / d);

        if (yearOfService > 2)
            insuranceamount += grosssalary * yearOfService * 0.75;

        if (IsParentCovered)
            insuranceamount += grosssalary * 1.8 + 20000;

        return insuranceamount;
    }

    public int calculateLeaveBalance() {
        return casualLeave + SickLeave + floatingLeave - leavesTaken;
    }
}
