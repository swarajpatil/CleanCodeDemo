package main.java.LongParameterList;

public class Employee {

    private final Salary salary = new Salary();
    private final Investment investment = new Investment();
    private String name;
    private String email;
    private CharSequence firstName;

    public Employee(String Name) {
        name = Name;
    }

    public Employee(String employeeDatum, String employeeDatum1, String employeeDatum2, String employeeDatum3) {

    }

    public void incomeTax() {
        IncomeTax incomeTax = new IncomeTax();
        System.out.println("Your total income tax is ");
        double tax = incomeTax.calculate(salary.getBasicSalary(), salary.getHRA(), salary.getTransportAllounce(),
                salary.getSpecialAllounce(), salary.getLTA(), salary.getMedicalAllounce(),
                investment.get80CInvestment(), investment.getinvestment80D());
        System.out.println(tax);
    }

    public boolean isBirthday(BirthDate xDate) {
        return false;
    }

    public String getEmail() {
        return email;
    }

    public CharSequence getFirstName() {
        return firstName;
    }


}



