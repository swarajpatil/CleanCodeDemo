package main.java.PrimitiveObsession;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer phoneNumber;
    private double Salary;
    private Integer[] stdcodes = new Integer[]
            {
                    020, 022, 721
            };
    private String workLocation;

    public Employee(String firstName, String lastName, Integer phoneNumber, double salary) throws InvalidaPhoneNumberException {
        this.firstName = firstName;
        this.lastName = lastName;
        Salary = salary;
        if (isPhoneNumberValid(phoneNumber))
            this.phoneNumber = phoneNumber;
    }

    private boolean isPhoneNumberValid(Integer phoneNumber) throws InvalidaPhoneNumberException {

        if (phoneNumber.toString().length() > 10) {
            Integer stdcode = Integer.parseInt(phoneNumber.toString().substring(0, 3));
            if (!Arrays.stream(stdcodes).anyMatch(code -> code == stdcode)) {
                throw new InvalidaPhoneNumberException();
            }
        }

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

    public String getSalary() {
        if (workLocation == "offshore")
            return Salary + " INR";
        else
            return Salary + " USD";
    }
}
