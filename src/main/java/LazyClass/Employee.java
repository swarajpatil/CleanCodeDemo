package main.java.LazyClass;

import main.java.PrimitiveObsession.InvalidaPhoneNumberException;

import java.util.regex.Pattern;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer phoneNumber;
    private double Salary;
    private String workLocation;

    public Employee(String firstName, String lastName, Integer phoneNumber, double salary, String workLocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        Salary = salary;
        this.workLocation = workLocation;
        this.phoneNumber = phoneNumber;
    }

    private boolean isPhoneNumberValid(Integer phoneNumber) throws InvalidaPhoneNumberException {

        if (phoneNumber.toString().length() != 10)
            throw new InvalidaPhoneNumberException();

        Pattern pattern = Pattern.compile(".*\\D.*");
        if (!pattern.matcher(phoneNumber.toString()).matches()) {
            throw new InvalidaPhoneNumberException();
        }

        return true;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getFormattedPhoneNumber() {
        String stdCode = phoneNumber.toString().substring(0, 3);
        String number = phoneNumber.toString().substring(3, 8);
        return "(" + stdCode + ")-" + number;
    }

    public double getSalary() {
        return Salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }
}
