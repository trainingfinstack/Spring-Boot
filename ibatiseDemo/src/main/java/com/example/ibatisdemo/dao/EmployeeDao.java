package com.example.ibatisdemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ibatisdemo.model.Employee;
@Repository
public interface EmployeeDao {

	public List<Employee> findEmployee();
	public List<Employee> findEmployeeById(int id);
	public void addEmployee(Employee employee);
	public void updateEmployee(int id, String name, String address);
	public void deleteEmployee(int id);
	public List<Employee> joinTables();
//	public List<Employee> fullDetails(int id);
}
