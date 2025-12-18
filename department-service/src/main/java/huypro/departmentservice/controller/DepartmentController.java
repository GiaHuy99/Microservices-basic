package huypro.departmentservice.controller;

import huypro.departmentservice.entity.Department;
import huypro.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return departmentService.getDepartment(id);
    }
    @PostMapping
    public Department create( @RequestBody Department department) {
        return departmentService.create(department);
    }
}
