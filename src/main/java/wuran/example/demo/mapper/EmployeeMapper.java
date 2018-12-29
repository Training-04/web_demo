package wuran.example.demo.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import wuran.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    @Results({
        @Result(property = "employeeId",column = "employee_id"),
            @Result(property = "firstName",column = "first_name"),
            @Result(property = "lastName",column = "last_name"),
            @Result(property = "email",column = "email"),
            @Result(property = "phoneNumber",column = "phone_number"),
            @Result(property = "hireDate",column = "hire_date"),
            @Result(property = "jobId",column = "job_id"),
            @Result(property = "salary",column = "salary"),
            @Result(property = "commissionPCT",column = "commission_pct"),
            @Result(property = "departmentId",column = "department_id"),

    })
    @Select("select * from employees")
    List<Employee> getAll();
}
