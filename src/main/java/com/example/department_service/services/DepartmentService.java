package com.example.department_service.services;
import com.example.department_service.entity.Department;
import com.example.department_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Optional<Department> findDepartmentById(int id) {
        return departmentRepository.findById(id);
    }

    public List<Department> findAll() {
        return  departmentRepository.findAll();
    }

}
