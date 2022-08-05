package com.example.ibatisdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ibatisdemo.model.Employee;
import com.example.ibatisdemo.service.EmployeeService;

@RestController
public class SampleController {

	@Autowired
	private EmployeeService  employeeService ;
	

	@GetMapping("/employee")
	public List<Employee> getEmployeeList() {
		
		List<Employee> employeeList = employeeService.findEmployee();
		
		return employeeList ;
	}
	@GetMapping("/employee/{id}")
     public List<Employee> getEmployeeListById(@PathVariable("id") int id) {
		
		List<Employee> employeeList = employeeService.findEmployeeById(id);
		return employeeList ;
	}
	
	@PostMapping("/employee")
	public String addEmployee(Model model,@RequestBody Employee employee) {
	     this.employeeService.addEmployee(employee);
	     return "Inserted";
		}
	@PutMapping("/employee/{id}")
	public String updateEmployee(@RequestBody Employee employee,@PathVariable("id") int id) {
	
		String name =employee.getName();
		String address= employee.getAddress();
		this.employeeService.updateEmployee(id,name,address);
		return "Updated";
	}
	

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") int id){
		if(employeeService.findEmployeeById(id)!=null)
		{
		this.employeeService.deleteEmployee(id);
		return "Record Deleted";
		}
		else 
			return "try again";
	}
	
	@GetMapping("/employee/join")
	public List<Employee> joinTables(Model model) {
		
		List<Employee> list = employeeService.joinTables();
		 model.addAttribute("employeeList", list);
		return list ;
	}
//	@GetMapping("/employee/details/{id}")
//	public List<Employee> getEmployeeDetial(@PathVariable("id") int id) {
//		
//		List<Employee> employeeList = employeeService.fullDetails(id);		
//		return employeeList ;
//	}
}
