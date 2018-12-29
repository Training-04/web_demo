package wuran.example.demo.DAL;

import org.springframework.data.jpa.repository.JpaRepository;
import wuran.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Double> {
}
