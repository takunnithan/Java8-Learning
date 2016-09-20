package lambda.predicate;

/**
 * Created by takunnithan on 09/04/2016.
 */
public class Employee {
    private int empId;
    private String empName;
    private double empSalary;
    private int experience;

    public Employee(int empId, String empName, double empSalary, int experience) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.experience = experience;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
