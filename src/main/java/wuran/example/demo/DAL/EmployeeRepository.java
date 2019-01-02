package wuran.example.demo.DAL;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wuran.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Double> {
}
