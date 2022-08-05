package com.example.ibatisdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ibatisdemo.dao.EmployeeDao;
import com.example.ibatisdemo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> findEmployee() {
		
		return employeeDao.findEmployee() ;
	}

	@Override
	public List<Employee> findEmployeeById(int id) {
		
		return employeeDao.findEmployeeById(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		
		employeeDao.addEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
		
	}

	@Override
	public void updateEmployee(int id, String name, String address) {
		
		employeeDao.updateEmployee(id,name, address);
	}

	@Override
	public List<Employee> joinTables() {
		return employeeDao.joinTables();
	}

//	@Override
//	public List<Employee> fullDetails(int id) {
//		return employeeDao.fullDetails(id) ;
//	}

}
