package main.java.DuplicateCode;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class FullTimeEmployee {

    private String name;
    private LocalDate dateOfBirth;
    private LocalDate hireDate;
    private double Basic;
    private double travelAllowance;
    private double HRA;
    private double medicalAllowance;

    public FullTimeEmployee(String name, LocalDate dateOfBirth, LocalDate hireDate, double basic, double travelAllowance, double hra, double medicalAllowance) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.Basic = basic;
        this.travelAllowance = travelAllowance;
        this.HRA = hra;
        this.medicalAllowance = medicalAllowance;
    }


    public double calculateInsuranceAmount() {
        double grosssalary = (Basic + HRA + travelAllowance + medicalAllowance) - Basic * 12 / 100;
        double insuranceamount = grosssalary * 5 + 3 * Basic;

        long diff = DAYS.between(hireDate, LocalDate.now());
        Integer yearOfService = Math.round(diff / 365);

        if (yearOfService > 3)
            insuranceamount += grosssalary * yearOfService * 1.5;


        long diff1 = DAYS.between(dateOfBirth, LocalDate.now());
        Integer age = Math.round(diff1 / 365);

        if (age > 40)
            insuranceamount += grosssalary * 4;

        return insuranceamount;
    }

    public double calculateSpecialIncentive() {
        double grosssalary = (Basic + HRA + travelAllowance + medicalAllowance) - Basic * 12 / 100;
        double incentiveAmount = grosssalary * 0.5 + Basic;

        long diff = DAYS.between(hireDate, LocalDate.now());
        Integer yearOfService = Math.round(diff / 365);

        if (yearOfService > 3)
            incentiveAmount += grosssalary * yearOfService;

        return incentiveAmount;
    }

    public String getName() {
        return name;
    }
}

