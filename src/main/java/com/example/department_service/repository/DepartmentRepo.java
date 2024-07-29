package com.example.department_service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.department_service.view.Department;

@Repository
public class DepartmentRepo {
	
	private List<Department> departments = new ArrayList<>();
	
    public Department addDepartment(Department department) {
    	departments.add(department);
        return department;
    }
    
//    public Department findByID(Long id) {
//		return departments.stream()
//				.filter(department -> department.getId().equals(id))
//				.findFirst().orElseThrow();
//    }
    
    public List<Department> findAll(){
    	return departments;
    }
}

