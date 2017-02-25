package main.java.LazyClass;

public class Manager extends Employee {
    private String projectName;
    private double incentive;

    public Manager(String firstName, String lastName, Integer phoneNumber, double salary, String workLocation, String projectName) {
        super(firstName, lastName, phoneNumber, salary, workLocation);
        this.projectName = projectName;
    }

    public double getIncentive() {
        return getSalary() * 0.1;
    }

    public String getProjectName() {
        return projectName;
    }
}
