package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.java7.model.Employee;

public class EmployeeRepository {
	private static List<Employee> employees = new ArrayList<>();
	
	public static List<Employee> getEmployees() {
		return employees;
	}
	static {
		employees.add(new Employee(1L,"abc","manager",100000.00));
		employees.add(new Employee(2L,"cde","lead",80000.00));
		employees.add(new Employee(3L,"fgh","analyst",70000.00));
		employees.add(new Employee(4L,"ijk","trainee",60000.00));
		employees.add(new Employee(5L,"lmn","manager",120000.00));
		employees.add(new Employee(6L,"opq","consultant",110000.00));
	}

}
