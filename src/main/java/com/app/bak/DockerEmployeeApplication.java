package com.app.bak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.bak.service.EmployeeService;

@SpringBootApplication
public class DockerEmployeeApplication implements ApplicationRunner {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(DockerEmployeeApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// Setup or initialization activities
		employeeService.addDummyData();
	}
}
