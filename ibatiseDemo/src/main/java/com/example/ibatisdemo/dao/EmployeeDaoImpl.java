package com.example.ibatisdemo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ibatisdemo.mapper.EmployeeMapper;
import com.example.ibatisdemo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> findEmployee() {
		
		return employeeMapper.findEmployee() ;
	}

	@Override
	public List<Employee> findEmployeeById(int id) {
		
		return employeeMapper.findEmployeeById(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		
		 employeeMapper.addEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeMapper.deleteEmployee(id);
		
	}

	@Override
	public void updateEmployee(int id, String name, String address) {
		employeeMapper.updateEmployee(id, name, address);
	}

	@Override
	public List<Employee> joinTables() {
		return employeeMapper.joinTables();
	}

//	@Override
//	public List<Employee> fullDetails(int id) {
//		return employeeMapper.fullDetails(id) ;
//	}
//	

}
