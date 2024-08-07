package com.example.department_service.repository;

import com.example.department_service.entity.Department;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.ArrayList;
import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

//    List<Department> departments = new ArrayList<>();
//
//    public default Department addDepartment(Department department) {
//        departments.add(department);
//        return department;
//    }
//
//    public static Department findByID(Long id) {
//        return departments.stream()
//                .filter(department -> Long.valueOf(department.getId()).equals(id))
//                .findFirst().orElseThrow();
//    }
//
//    public default List<Department> findAll(){
//        return departments;
//    }
}



