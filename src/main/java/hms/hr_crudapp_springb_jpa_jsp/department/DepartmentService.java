package hms.hr_crudapp_springb_jpa_jsp.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public List<Department> getAllDep(){
        return (List<Department>) departmentRepo.findAll();
    }

    public void addDepatment(Department department){
        departmentRepo.save(department);
    }

}
