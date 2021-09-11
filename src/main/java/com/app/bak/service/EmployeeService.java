package com.app.bak.service;

import java.util.List;

import com.app.bak.model.Employee;
import com.app.bak.util.ResponseStatus;

public interface EmployeeService {

	public List<Employee> getEmployeeList();

	public List<Employee> getEmployeesByPagination(int pageNumber, int pageSize, String sortOrder, String sortingBy);

	public Employee getEmployee(int employeeId);

	public ResponseStatus addEmployee(Employee employee);

	public ResponseStatus addEmployees(List<Employee> employees);

	public ResponseStatus updateEmployee(Employee employee);

	public ResponseStatus deleteEmployee(int employeeId);

	public ResponseStatus deleteAll();

	public Employee getEmployeeByName(String name);

	public boolean addDummyData();
	
}
