package main.java.DuplicateCode;

import java.util.Date;

public class Employee {
    protected double Basic;
    protected double DA;
    protected double TA;
    protected double MA;
    protected Date hireDate;
    protected boolean IsParentCovered;
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

    public int calculateLeaveBalance() {
        return casualLeave + SickLeave + floatingLeave - leavesTaken;
    }

    protected double getGrosssalary() {
        return (Basic + DA + TA + MA) - Basic * 12 / 100;
    }

    public void setCasualLeave(int casualLeave) {
        this.casualLeave = casualLeave;
    }

    public void setSickLeave(int sickLeave) {
        SickLeave = sickLeave;
    }

    public void setFloatingLeave(int floatingLeave) {
        this.floatingLeave = floatingLeave;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }
}
