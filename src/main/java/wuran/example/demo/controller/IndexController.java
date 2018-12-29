package wuran.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wuran.example.demo.DAL.EmployeeRepository;
import wuran.example.demo.entity.Employee;
import wuran.example.demo.mapper.EmployeeMapper;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class IndexController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeRepository employeeRepository;
    @RequestMapping("/index")
    public List<Employee> index(){
//        List<Employee> es= employeeMapper.getAll();
//        String name=es.get(0).getFirstName();
        List<Employee> es=employeeRepository.findAll();
        return es;
    }
}
