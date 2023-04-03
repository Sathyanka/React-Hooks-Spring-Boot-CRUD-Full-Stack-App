package com.JavaGuides.springBootBackEnd;

import com.JavaGuides.springBootBackEnd.model.Employee;
import com.JavaGuides.springBootBackEnd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackEndApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		//Employee employee = new Employee();
		//employee.setFirstName("Prabuddhi");
		//employee.setLastName("Gunathilaka");
		//employee.setEmailId("psathya@gmail.com");
		//employeeRepository.save(employee);
	}
}
