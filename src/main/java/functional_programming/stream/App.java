package functional_programming.stream;


import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    static List<Employee> employeeList = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        App app = new App();

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();



    }

    /*1. List all distinct project in non-ascending order. */
    Function<List<Employee>, Set<Project>> getDistinctProjects  = employeeList ->
            employeeList.stream()
                    .flatMap(employees -> employees.getProjects().stream())
                    .sorted(Comparator.comparing(Project::getName).reversed())
                    .collect(Collectors.toCollection(LinkedHashSet::new));


    /*2. Print full name of any employee whose firstName starts with ‘A’.*/
    Consumer<List<Employee>> firstnameWithA = list ->
            list.stream()
                    .filter(employee -> employee.getFirstName().startsWith("A"))
                    .forEach(employeeA -> System.out.println(employeeA.getFirstName() + employeeA.getLastName()));

/* 3. List of all employee who joined in year 2023;
    + getEmployeeByYear(List<Employee> employees, String year): List<Employee>
       - iterate over the employees; stream
       - employees.getId().getYearJoined
       - filter out the employees matching the year
       - collect them in a List:: ArrayList

 */


//    BiFunction<List<Employee>, String, List<Employee>> getEmployeesByYear =
//            (employeesList, year) -> employeesList.stream()
//                    .filter(emp -> emp.getId().substring(0,4).ma )



/*13. Create a map based on this data, they key should be the year of joining,
and value should be list of all the employees who joined the particular year. (Hint : Collectors.toMap)
 */
    public Map<String, List<Employee>> employeesByYearOfJoining() {
        Map<String, List<Employee>> employeesByYear = new HashMap<>();

        // Group employees by their year of joining
        Set<String> yearsOfJoining = employeeList.stream()
                .map(emp -> emp.getId().substring(0,4))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        return employeesByYear;
    }

}