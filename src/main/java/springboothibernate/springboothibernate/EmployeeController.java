package springboothibernate.springboothibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @GetMapping("/save")
    public String saveEmployee(
            @RequestParam String name,
            @RequestParam double salary
    ) {

        Employee emp = new Employee();

        emp.setName(name);
        emp.setSalary(salary);

        repository.save(emp);

        return "Employee Saved Successfully";
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {

        return repository.findAll();
    }
}