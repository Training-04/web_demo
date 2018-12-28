package wuran.example.demo.entity;

import java.util.Date;

public class Employee {
    public double getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(double employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCommissionPCT() {
        return commissionPCT;
    }

    public void setCommissionPCT(double commissionPCT) {
        this.commissionPCT = commissionPCT;
    }

    public double getManagerId() {
        return managerId;
    }

    public void setManagerId(double managerId) {
        this.managerId = managerId;
    }

    public double getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(double departmentId) {
        this.departmentId = departmentId;
    }

    private double employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date hireDate;
    private String jobId;
    private double salary;
    private double commissionPCT;
    private double managerId;
    private double departmentId;
}
