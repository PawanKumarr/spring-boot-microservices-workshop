package org.pawan.department.service;

import org.pawan.department.entity.Department;
import org.pawan.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getById(Long id) {
        return departmentRepository.findByDepartmentId(id);
    }
}
