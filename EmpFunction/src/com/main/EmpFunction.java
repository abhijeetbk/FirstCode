package com.main;

import com.emp.model.EmpModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class EmpFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean empDone = false;
		List<EmpModel> emplist = new ArrayList();
		while (!empDone){
			EmpModel employee = new EmpModel();
			//Enter Employee Number
			System.out.println("Enter Employee Number ");
			Scanner sc = new Scanner(System.in);
			int empNum = sc.nextInt();
			employee.setEmpNumber(empNum);
			//Enter Name
			System.out.println("Enter Employee Name ");
			String empName = sc.next();
			employee.setEmpName(empName);
			//Enter Salary
			System.out.println("Enter Employee Salary ");
			float empSal = sc.nextFloat();
			employee.setEmpSalary(empSal);
			//add Employee
			emplist.add(employee);
			System.out.println("All Employees Entered (yes /no) ");
			String userInp = sc.next();
			if("yes".equalsIgnoreCase(userInp)){
				empDone = true;
				//EmpModel a;
				System.out.println("Emp Number " + "\t\t" + "Emp Name " + "\t\t" + "Emp Salary ");
				for (EmpModel object: emplist) {					 
				    System.out.println(" ");
					System.out.print(object.getEmpNumber());
				    System.out.print("\t\t\t" + object.getEmpName());
				    System.out.print("\t\t" + object.getEmpSalary());
				}
				//emplist.forEach((a)-> System.out.println(a));
				//emplist.forEach(System.out::println);
			}
			}
		}
}
