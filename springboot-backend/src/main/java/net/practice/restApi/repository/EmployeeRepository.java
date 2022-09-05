package net.practice.restApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.practice.restApi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
