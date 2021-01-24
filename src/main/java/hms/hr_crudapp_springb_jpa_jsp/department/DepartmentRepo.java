package hms.hr_crudapp_springb_jpa_jsp.department;


import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo  extends CrudRepository<Department,String> {
}
