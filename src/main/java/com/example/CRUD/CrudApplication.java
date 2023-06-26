package com.example.CRUD;

import com.example.CRUD.model.Employee;
import com.example.CRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {


		




//		Employee employee = new Employee();
//		employee.setFirstName("Bilal");
//		employee.setLastName("Alam");
//		employee.setEmailId("bilal.alam5491@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Alam");
//		employee1.setLastName("Bilal");
//		employee1.setEmailId("Qwerty5491@gmail.com");
//		employeeRepository.save(employee1);


	}
}
