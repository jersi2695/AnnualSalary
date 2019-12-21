package com.annualSalary.dal;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.annualSalary.dto.Employee;

@Service
public class EmployeeDal implements IEmployeeDal {

	private final static String API_EMPLOYEES_GET =  "http://masglobaltestapi.azurewebsites.net/api/Employees";
	
	@Override
	public Employee[] findEmployees() {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Employee[]> response = restTemplate.getForEntity(API_EMPLOYEES_GET, Employee[].class);
		
		return response.getBody();
	}

}
