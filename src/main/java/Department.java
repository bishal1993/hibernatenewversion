import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departement_id", nullable = false)
    private Long departementID;
    @Getter
    @Setter
    @OneToMany
    private ArrayList<Course> courses;
    @Getter
    @Setter
    @OneToMany
    private ArrayList<Employee> employees;
    @Getter
    @Setter
    private  String departmentName;


}
