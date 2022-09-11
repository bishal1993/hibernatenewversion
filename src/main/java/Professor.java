import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Entity
public class Professor extends  Employee{
    @Getter
    @Setter
    @OneToMany
    private ArrayList<Department> departments;
    @Getter
    @Setter
    @OneToMany
    private ArrayList<Course> courses;
}
