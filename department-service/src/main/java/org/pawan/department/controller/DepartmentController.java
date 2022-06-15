package org.pawan.department.controller;

import org.pawan.department.entity.Department;
import org.pawan.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id){
        return departmentService.getById(id);
    }

}
