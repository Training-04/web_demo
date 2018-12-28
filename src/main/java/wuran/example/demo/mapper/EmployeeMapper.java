package wuran.example.demo.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import wuran.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeMapper {

    @Results({
        @Result(property = "employeeId",column = "employee_id"),
    })
    @Select("select * from employees")
    List<Employee> getAll();
}
