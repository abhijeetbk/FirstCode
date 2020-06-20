package com.emp.model;


public class EmpModel {
	private int empNumber;
	private String empName;
	private String empDesignation;
	private int empManager;
	private float empSalary;
	/**
	 * @return the empNumber
	 */
	public int getEmpNumber() {
		return empNumber;
	}
	/**
	 * @param empNum the empNumber to set
	 */
	public void setEmpNumber(int empNum) {
		this.empNumber = empNum;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDesignation
	 */
	public String getEmpDesignation() {
		return empDesignation;
	}
	/**
	 * @param empDesignation the empDesignation to set
	 */
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	/**
	 * @return the empManager
	 */
	public int getEmpManager() {
		return empManager;
	}
	/**
	 * @param empManager the empManager to set
	 */
	public void setEmpManager(int empManager) {
		this.empManager = empManager;
	}
	/**
	 * @return the empSalary
	 */
	public float getEmpSalary() {
		return empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
}
