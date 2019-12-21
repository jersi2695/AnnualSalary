package com.annualSalary.bl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.annualSalary.dal.IEmployeeDal;
import com.annualSalary.dto.Employee;
import com.annualSalary.exceptions.AnnualSalaryException;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDal employeeDal;

	/**
	 * Returns a list with all employees if the parameter is null or a list with the employee object corresponding to the id
	 * If the parameter id does not match with any employees, the method returns an empty list
	 * The time complexity O(n) because the algorithm does a complete loop on the list
	 * @param id	the employee id
	 * @return 		the list of employees
	 */
	@Override
	public List<Employee> getEmployees(Integer id) throws AnnualSalaryException{
		try {
			List<Employee> employees = Arrays.asList(employeeDal.findEmployees());
			
			if(id != null) {
				employees = employees.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
			}
			
			employees.forEach(x -> { x.calculateSalary();});
			
			return employees;
		}catch (Exception e) {
			throw new AnnualSalaryException(e.getMessage());
		}
		
	}
	
	


}
