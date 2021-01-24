package hms.hr_crudapp_springb_jpa_jsp.employee;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepo  extends CrudRepository<Employee,String> {
 @Query("select u from Employee u where u.empId = ?1 and u.depId = ?2")
 List<Employee> findByEmpIdAndDepId(String empId,String depId);

 @Query("select u from Employee u where u.empId = ?1")
 List<Employee> findByEmpId(String empId);

List<Employee> findByNicStartsWith(String start);
@Query("select u from Employee u where u.depId = ?1")
List<Employee> findByDepId(String depId);
}
