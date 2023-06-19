package com.codeclan.example.employeeservice.Repositories;

import com.codeclan.example.employeeservice.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
