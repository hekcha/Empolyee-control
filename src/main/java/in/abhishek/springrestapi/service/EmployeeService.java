package in.abhishek.springrestapi.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import in.abhishek.springrestapi.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployee(int pageNumber,int pageSize);
	
	Employee saveEmployee(Employee employee);
	
	Employee getSingleEmployee(Long id);
	
	String deleteEmployee(Long id);

	Employee updateEmployee(Employee employee);
	
	List<Employee> getEmployeeByName(String name);

	List<Employee> getEmployeeByNameAndLocation(String name,String location);
	
	List<Employee> getEmployeesByNameContaining(String keyword);
	
	List<Employee> getEmployeesWithNameOrLocation(String name,String Location);
	
	Integer deleteEmployeesByName(String name);


}
