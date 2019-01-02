package wuran.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wuran.example.demo.DAL.EmployeeRepository;
import wuran.example.demo.entity.Employee;
import wuran.example.demo.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/index")
    public String index(){
        return "/employee/list";
    }

    @RequestMapping("/leafindex")
    public String index(Model model){
        List<Employee> es= employeeService.getAll();
        model.addAttribute("es",es);
        return "employee/index";
    }
    @RequestMapping("/add")
    public String add(Model model){

        return "employee/add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Employee employee){
        employeeService.add(employee);
        return "redirect:/leafindex";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Double id){
        employeeService.deleteById(id);
        return "redirect:/leafindex";
    }
    @RequestMapping("/update/{id}")
    public String update(Model model,@PathVariable("id") Double id){
        Employee employee=employeeService.get(id);
        model.addAttribute("employee",employee);
        return "/employee/update";
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Employee employee){
        employeeService.update(employee);
        return "redirect:/update/"+employee.getEmployeeId();
    }



}
