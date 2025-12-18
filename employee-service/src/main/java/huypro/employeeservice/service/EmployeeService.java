package huypro.employeeservice.service;

import huypro.employeeservice.entity.Employee;


public interface EmployeeService {
     Employee getEmployee( Long id);
     Employee create( Employee employee);
}
