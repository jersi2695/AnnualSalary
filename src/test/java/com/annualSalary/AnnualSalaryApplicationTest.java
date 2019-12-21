package com.annualSalary;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.annualSalary.bl.IEmployeeService;
import com.annualSalary.exceptions.AnnualSalaryException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AnnualSalaryApplicationTest {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@Test
    public void verifyResult() throws AnnualSalaryException {
		assertThat(employeeService).isNotNull();
		
		assertThat(employeeService.getEmployees(null)).size().isEqualTo(2);
		assertThat(employeeService.getEmployees(1)).size().isEqualTo(1);
		assertThat(employeeService.getEmployees(2)).size().isEqualTo(1);
		assertThat(employeeService.getEmployees(3)).size().isEqualTo(0);
		
		assertThat(employeeService.getEmployees(1).get(0).getSalary()).isEqualTo(86400000);
    }

}
