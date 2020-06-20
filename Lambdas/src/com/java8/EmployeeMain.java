package com.java8;

import java.util.List;


import com.java7.model.Employee;
import com.repository.EmployeeRepository;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeRepository.getEmployees();
		System.out.println("before");
		employees.forEach(e->System.out.println(e.getName()+ " "+e.getSalary()+" "+e.getDesignation()));
		
		employees.stream()
		.filter(e->"manager".equals(e.getDesignation()))
		.filter(emp->emp.getSalary()>=100000)
		.forEach(employee->employee.setSalary(employee.getSalary()*0.9));
		System.out.println("after");
		
		employees.forEach(e->System.out.println(e.getName()+ " "+e.getSalary()+" "+e.getDesignation()));
		}

	

}
