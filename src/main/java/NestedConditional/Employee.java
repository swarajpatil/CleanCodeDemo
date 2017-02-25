package main.java.NestedConditional;

import java.util.Date;

public class Employee {

    private Date hireDate;
    private boolean isManager;
    private boolean isSales;
    private boolean isDisabled;
    private double CostToCompany;
    private int targetAchieved;

    double getSpecialIncentive() {
        double result;
        if (isManager)
            result = CostToCompany * 5 / 100;
        else {
            if (isSales)
                result = CostToCompany * 2 / 100 + targetAchieved * 2000;
            else {
                if (isDisabled) {
                    result = CostToCompany * 10 / 100;
                } else {
                    if (yearOfService() < 1) {
                        result = (double) 5000;
                    } else
                        result = CostToCompany * 1 / 100;
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
}
