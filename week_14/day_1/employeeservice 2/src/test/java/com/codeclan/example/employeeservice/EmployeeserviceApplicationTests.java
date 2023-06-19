package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.Repositories.DepartmentRepository;
import com.codeclan.example.employeeservice.Repositories.EmployeeRepository;
import com.codeclan.example.employeeservice.Repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("Evil Dept");
		departmentRepository.save(department);
		Employee employee = new Employee("Mr", "Tinkles", 69420 ,department);

		Project project1 = new Project("Operation Dark Storm", 7);
		projectRepository.save(project1);

		employee.addProject(project1);

		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeesToDepartment(){
		Department department = new Department("Human Resources");
		departmentRepository.save(department);
		Employee employee2 = new Employee("Carol", "In HR", 24601, department);
		Employee employee1 = new Employee("Ninja", "Cat", 71823, department);

		Project project2 = new Project("Stop Operation Dark Storm", 7);
		projectRepository.save(project2);
		employee2.addProject(project2);
		employee1.addProject(project2);
		employeeRepository.save(employee2);
		employeeRepository.save(employee1);
	}



}
