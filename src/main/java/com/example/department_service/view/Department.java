package com.example.department_service.view;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private int id ;
	private String name;
	
	
	private List<Employee>  employee = new ArrayList<>();
	
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
				
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "department [id=" + id + ", name=" + name + ", employee=" + employee + "]";
	}

}
