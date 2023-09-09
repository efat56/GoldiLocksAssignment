package com.goldilocks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goldilocks.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
