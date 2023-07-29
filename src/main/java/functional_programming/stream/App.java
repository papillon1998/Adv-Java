package functional_programming.stream;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {
        List<Employee> employeeList = new ArrayList<>();

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
    Consumer<List<Employee>> employeesNameStartingWithA = list ->
            list.stream()
                    .filter(employee -> employee.getFirstName().startsWith("A"))
                    .forEach(employeeA -> System.out.println(employeeA.getFirstName() +" "+ employeeA.getLastName()));

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


}