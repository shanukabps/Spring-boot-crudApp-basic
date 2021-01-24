package hms.hr_crudapp_springb_jpa_jsp.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee(){
        return (List<Employee>) employeeRepo.findAll();
    }

    public void addEmployee(Employee employee){
        employeeRepo.save(employee);
    }

    public void deleteEmployee(String empId,String depId){
            Employee employee= employeeRepo.findByEmpIdAndDepId(empId,depId).get(0);
            employeeRepo.delete(employee);
    }

    public Employee findByEmpIdAndDepId(String empId,String depId){
            return employeeRepo.findByEmpIdAndDepId(empId,depId).get(0);
    }
    public List<Employee> findByEmpId(String empId){
        return employeeRepo.findByEmpId(empId);
    }

    public List<Employee> findByDepId(String depId){
        return employeeRepo.findByDepId(depId);
    }

    public List<Employee> findByNicStartsWith(String nicStart){
         return  employeeRepo.findByNicStartsWith(nicStart);

    }
}
