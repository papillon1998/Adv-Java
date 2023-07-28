package functional_programming.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private int salary;
    private int totalLaptopsAssigned;
    // OneToMany
    private List<Project> projects;

}
