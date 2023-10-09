package in.abhishek.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.abhishek.springrestapi.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
