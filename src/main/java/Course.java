import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id", nullable = false)
    private Long courseID;
    @Getter
    @Setter
    @ManyToOne
    private  Department department;
    @Getter
    @Setter
    private ArrayList<Student> students;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    @ManyToOne
    private Professor professor;


}
