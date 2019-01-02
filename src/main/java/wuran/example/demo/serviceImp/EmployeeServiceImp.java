package wuran.example.demo.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import wuran.example.demo.DAL.EmployeeRepository;
import wuran.example.demo.entity.Employee;
import wuran.example.demo.service.EmployeeService;

import javax.annotation.PostConstruct;

@Service
public class EmployeeServiceImp extends BaseServiceImp<Employee,Double> implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    protected void setRepository() {
        super.repository= employeeRepository;
    }


}
