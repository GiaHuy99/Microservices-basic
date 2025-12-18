package huypro.departmentservice.service;

import huypro.departmentservice.entity.Department;

public interface DepartmentService {
     Department getDepartment(Long id);
    Department create(Department department);
}
