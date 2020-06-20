package com.java7;

import java.util.List;

import com.java7.model.Employee;
import com.repository.EmployeeRepository;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeRepository.getEmployees();
		System.out.println("before");
		for(Employee e: employees) {
			System.out.println("name is "+e.getName() + "Salary is "+e.getSalary());
		}
		
			
		
		for (Employee e:employees) {
			if ("manager".equalsIgnoreCase(e.getDesignation())) {
				if(e.getSalary() >=100000) {
					e.setSalary(e.getSalary()*0.9);
				}
			}
		}
		System.out.println("after");
		for(Employee e: employees) {
			System.out.println("name is "+e.getName() + "Salary is "+e.getSalary());
		}
	}

}
