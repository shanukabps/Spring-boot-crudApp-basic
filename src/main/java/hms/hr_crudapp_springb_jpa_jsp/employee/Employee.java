package hms.hr_crudapp_springb_jpa_jsp.employee;



import hms.hr_crudapp_springb_jpa_jsp.department.Department;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="emp")
@AllArgsConstructor
@NoArgsConstructor
@IdClass(EmployeePkid.class)
public class Employee {

    @Id
    private String empId;
    @Id
    private String depId;
    private String name;
    private String nic;
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date joinDate;
    @ManyToOne
    private Department department;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
