package com.goldilocks.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldilocks.model.Employee;
import com.goldilocks.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {
	private final EmpRepo empRepo;

    @Autowired
    public EmpServiceImpl(EmpRepo employeeRepository) {
        this.empRepo = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public Employee createEmployee(String empName, int empAge) {
        Employee emp = new Employee();
        emp.setEmpName(empName);
        emp.setEmpAge(empAge);
        return empRepo.save(emp);
    }
}
