package wuran.example.demo.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wuran.example.demo.DAL.EmployeeRepository;
import wuran.example.demo.entity.Employee;
import wuran.example.demo.mapper.EmployeeMapper;
import wuran.example.demo.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/data")
@EnableAutoConfiguration
public class IndexController implements InitializingBean {


    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/index")
    public String index(){
//        List<Employee> es= employeeMapper.getAll();
//        String name=es.get(0).getFirstName();
        return "Employee/list";
    }
    @RequestMapping("/employees")
    public  List<Employee> getEmployees(){
        List<Employee> es=employeeService.getAll();

        return es;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void Add(Employee employee){
        employeeService.add(employee);
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
