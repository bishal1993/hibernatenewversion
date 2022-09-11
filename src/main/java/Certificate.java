import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certificate_id", nullable = false)
    @Getter
    private Long certificateID;

    @Getter
    @Setter
    @OneToMany
    private ArrayList<Course> courses;
    @Getter
    @Setter
    @OneToOne
    private Student student;



}
