package in.abhishek.springrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.abhishek.springrestapi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	
	@Query(value = "select * from employee",nativeQuery = true)
	List<Employee> getEmployee();
//	List<Employee> findByDepartmentName(String name);
//	
//	
//	@Query("FROM Employee WHERE department.name=:name")
//	List<Employee> findByDeptName(String name);
//	
}
