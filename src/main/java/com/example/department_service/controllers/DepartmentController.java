package com.example.department_service.controllers;

import java.util.List;
import java.util.Optional;

import com.example.department_service.entity.Department;
import com.example.department_service.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping("/all")
    public List<Department> getAllDepartments() {
      return service.findAll();
    }

    @GetMapping("find/{id}")
    public Optional<Department> getById(@PathVariable int id) {
      return service.findDepartmentById(id);
    }

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }
}
