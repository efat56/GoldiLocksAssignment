package com.goldilocks.service;

import java.util.List;

import com.goldilocks.model.Employee;

public interface EmpService {
	public List<Employee> getAllEmployees();
    public Employee createEmployee(String empName, int empAge);

}
