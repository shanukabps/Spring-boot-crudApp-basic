package hms.hr_crudapp_springb_jpa_jsp.department;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    private String depId;
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private DepType depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public DepType getDepName() {
        return depName;
    }

    public void setDepName(DepType depName) {
        this.depName = depName;
    }
}
