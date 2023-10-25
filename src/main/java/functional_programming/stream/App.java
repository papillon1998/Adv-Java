package functional_programming.stream;


import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

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

/* 3. List of all employee who joined in year mentioned */

    BiFunction<List<Employee>, String, List<Employee>> getEmployeesJoinedInYear =
            (employeesList, year) -> employeesList.stream()
                    .filter(emp -> emp.getId().substring(0,4).equals(year))
                    .collect(Collectors.toList());

/* 4. Sort employees based on firstName, for same firstName sort by salary.*/
    Function<List<Employee>, List<Employee>> sortEmployeesByNameThenSalary =
            employees -> employees.stream()
                    .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSalary))
                    .collect(Collectors.toList());


/*5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).

    - Get the distinct salaries of all employees.
    - Sort the salaries in descending order.
    - Get the nth highest salary from the sorted list.
    - Filter the employees whose salary matches the nth highest salary.
    - Print the names of those employees.
*/


    BiConsumer<List<Employee>, Integer> getEmployeesWithNthHighestSalary =
            (employees, n)-> employees.stream()
                    .filter(employee -> employee.getSalary() == employees.stream()
                            .sorted(Comparator.comparing(Employee::getSalary).reversed())
                            .collect(Collectors.toList()).get(n-1).getSalary())
                    .forEach(employee -> System.out.println(employee.getFirstName()+ " " + employee.getLastName()));


}