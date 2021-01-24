package hms.hr_crudapp_springb_jpa_jsp.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/deps")
    public List<Department> getAllDep(){
        return departmentService.getAllDep();
    }


    @RequestMapping(method= RequestMethod.POST,value="/deps")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepatment(department);

    }


}
