package hms.hr_crudapp_springb_jpa_jsp;

import hms.hr_crudapp_springb_jpa_jsp.department.DepType;
import hms.hr_crudapp_springb_jpa_jsp.department.Department;
import hms.hr_crudapp_springb_jpa_jsp.department.DepartmentRepo;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HrCrudappSpringbJpaJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrCrudappSpringbJpaJspApplication.class, args);
	}


	@Autowired
	private DepartmentRepo departmentRepo;


	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			departmentRepo.save(new Department("d1", DepType.SE));
			departmentRepo.save(new Department("d2",DepType.QA));
			departmentRepo.save(new Department("d3",DepType.HRM));
			departmentRepo.save(new Department("d4",DepType.MANAGMENT));
			departmentRepo.save(new Department("d5",DepType.SALES));


		};
	}
}


