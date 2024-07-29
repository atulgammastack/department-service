package com.example.department_service.controllers;

import java.util.List;
import com.example.department_service.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.department_service.view.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {
//    @Autowired
//    private DepartmentRepo repo;
//
//    @GetMapping("/")
//    public List<Department> getAllDepartments() {
//        System.out.println("Endpoint /department/ hit");
//        return repo.findAll();
//    }
}
