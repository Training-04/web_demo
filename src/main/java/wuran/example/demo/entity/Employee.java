package wuran.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity(name = "employees")
public class Employee {

    @Id
    @Column(name = "employee_id")
    private Double employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "hire_date")
    private Date hireDate;
    @Column(name = "job_id")
    private String jobId;
    @Column(name = "salary")
    private Double salary;
    @Column(name = "commission_pct")
    private Double commissionPCT;
    @Column(name = "manager_id")
    private Double managerId;
    @Column(name = "department_id")
    private Double departmentId;
    public Double getEmployeeId() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Double getCommissionPCT() {
        return commissionPCT;
    }

    public void setCommissionPCT(double commissionPCT) {
        this.commissionPCT = commissionPCT;
    }

    public Double getManagerId() {
        return managerId;
    }

    public void setManagerId(double managerId) {
        this.managerId = managerId;
    }

    public Double getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(double departmentId) {
        this.departmentId = departmentId;
    }

}
