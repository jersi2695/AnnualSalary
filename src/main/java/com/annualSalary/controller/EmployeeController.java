package com.annualSalary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.annualSalary.bl.IEmployeeService;
import com.annualSalary.dto.Employee;
import com.annualSalary.exceptions.AnnualSalaryException;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> employees(@RequestParam(value="id", required = false) Integer id){
		try {
			return employeeService.getEmployees(id);
		} catch (AnnualSalaryException e) {
			return new ArrayList<Employee>();
		}
	}

}
