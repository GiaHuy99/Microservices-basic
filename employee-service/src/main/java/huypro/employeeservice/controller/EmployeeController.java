package huypro.employeeservice.controller;

import huypro.employeeservice.entity.Employee;
import huypro.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }
    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }
}
