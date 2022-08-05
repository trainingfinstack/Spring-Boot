package com.example.ibatisdemo.service;

import java.util.List;

import com.example.ibatisdemo.model.Employee;


public interface EmployeeService {

	public List<Employee> findEmployee();
	public List<Employee> findEmployeeById(int id);
	public void addEmployee(Employee employee);
	public void updateEmployee(int id, String name, String address);
	public void deleteEmployee(int id);
	public List<Employee> joinTables();
//	public List<Employee> fullDetails(int id);
}
