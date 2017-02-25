package main.java.PrimitiveObsession;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Customer {
    private Integer phoneNumber;
    private Integer[] stdcodes = new Integer[]{020, 022, 721};
    private String fullName;
    private double billingAmount;
    private Integer noOfBillableEmployee;

    public Customer(String fullName, Integer phoneNumber) throws InvalidaPhoneNumberException {
        this.fullName = fullName;
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

    public String billingAmount() {
        return (noOfBillableEmployee * 10 * 80) + "USD";
    }
}
