import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Long employeeID;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    @ManyToOne
    private Department department;


}
