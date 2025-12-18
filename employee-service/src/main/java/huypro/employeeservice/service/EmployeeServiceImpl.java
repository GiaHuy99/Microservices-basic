package huypro.employeeservice.service;

import huypro.employeeservice.config.AppConfig;
import huypro.employeeservice.dto.DepartmentDTO;
import huypro.employeeservice.entity.Employee;
import huypro.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired

    private RestTemplate restTemplate;    @Override
    public Employee getEmployee(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        String url = "http://localhost:8080/api/departments/" + employee.getDepartmentId();
        DepartmentDTO department = restTemplate.getForObject(url, DepartmentDTO.class);
        if (department != null) {
            employee.setDepartmentName(department.getName());
        }
        return employee;
    }

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }
}
