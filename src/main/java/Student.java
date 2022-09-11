import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Long studentID;

    @Getter
    @Setter
    private  String name;
    @Getter
    @Setter
    @OneToOne
    private Certificate certificate;
    @Getter
    @Setter
    @OneToMany
    private ArrayList<Course> courses;

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

}
