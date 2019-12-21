package com.annualSalary.bl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.annualSalary.dto.Employee;
import com.annualSalary.exceptions.AnnualSalaryException;

@Service
public interface IEmployeeService {

	public List<Employee> getEmployees(Integer id) throws AnnualSalaryException;
}
