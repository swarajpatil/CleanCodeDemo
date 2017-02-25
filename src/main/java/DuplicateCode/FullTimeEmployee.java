package main.java.DuplicateCode;

import java.util.Date;

class FullTimeEmployee extends Employee {

    public double calculateInsuranceAmount() {
        double grosssalary = getGrosssalary();
        double insuranceamount = grosssalary * 5 + 3 * Basic;

        long diff = hireDate.getTime() - new Date().getTime();
        long d = (1000 * 60 * 60 * 24 * 365);
        Integer yearOfService = Math.round(diff / d);

        if (yearOfService > 3)
            insuranceamount += grosssalary * yearOfService * 1.5;

        if (IsParentCovered)
            insuranceamount += grosssalary * 2.5 + 30000;

        return insuranceamount;
    }

}

