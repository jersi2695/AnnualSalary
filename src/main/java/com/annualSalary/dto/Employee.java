package com.annualSalary.dto;

public class Employee {
	
	public final static String HOURLY_SALARY = "HourlySalaryEmployee";
	public final static String MONTHLY_SALARY = "MonthlySalaryEmployee";
	
	private int id;
	private String name;
	private String contractTypeName;
	private int roleId;
	private String roleName;
	private String roleDescription;
	private int hourlySalary;
	private int monthlySalary;
	private int salary;
	
	public Employee() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContractTypeName() {
		return contractTypeName;
	}

	public int getRoleId() {
		return roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public int getHourlySalary() {
		return hourlySalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public void setMonthlySalary(int monthSalary) {
		this.monthlySalary = monthSalary;
	}
	
	public void calculateSalary() {
		if(this.contractTypeName.equals(HOURLY_SALARY)) {
			this.salary = 120 * this.hourlySalary * 12;
		}else if(this.contractTypeName.equals(MONTHLY_SALARY)) {
			this.salary = this.monthlySalary * 12;
		}
	}
	
	

}
