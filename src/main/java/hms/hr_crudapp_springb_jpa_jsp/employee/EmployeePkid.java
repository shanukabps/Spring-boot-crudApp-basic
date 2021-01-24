package hms.hr_crudapp_springb_jpa_jsp.employee;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EmployeePkid implements Serializable {

    private String empId;
    private String depId;
}
