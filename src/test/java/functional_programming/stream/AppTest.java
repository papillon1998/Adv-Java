package functional_programming.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private App app;
    EmployeeFactory employeeFactory;
    @BeforeEach
    void init() {
        app = new App();
        employeeFactory = new EmployeeFactory();
    }

    @Test
    public void testGetDistinctProjects() {

        // Invoke the getDistinctProjects function
        Set<Project> distinctProjects = app.getDistinctProjects.apply(employeeFactory.getAllEmployee());

        Set<Project> expectedProjects = new LinkedHashSet<>();

        Project Delta = new Project("Delta Model", "Login", "Robert Downey Jr");
        Project Beta = new Project("Beta Enhancement", "Authentication", "Chris");
        Project TwoFactorAuth = new Project("Two Factor Authentication", "Authentication", "MSD");
        Project CommonUI = new Project("Common UI", "UI", "Robert Downey Jr");
        Project Pegasus = new Project("Pegasus Model", "Data", "Vikram");
        Project CustomerOnboarding = new Project("Customer Onboarding", "Ads", "Vedha");
        Project Verification = new Project("Source Verification", "Data", "Pablo");
        Project RemoveUsers = new Project("Remove Invalid User", "Proxy", "Jeetu");
        Project SiteReliability = new Project("Site Reliability", "Admin", "Zaheer Khan");
        Project DataTransition = new Project("Data Transition", "Data", "Atif Aslam");
        Project TwoPhaseDeployment =new Project("Two Phase Deployment", "Deployment", "Shaktiman");

        expectedProjects.addAll(List.of(Delta, Beta, Beta, TwoFactorAuth , CommonUI, Pegasus, CustomerOnboarding, Verification, RemoveUsers, SiteReliability,
                DataTransition, TwoPhaseDeployment));

        expectedProjects.stream().sorted(Comparator.comparing(Project::getName)).forEach(System.out::println);
//        distinctProjects.stream().forEach(System.out::println);

        assertEquals(expectedProjects, distinctProjects);

    }


    @Test
    void  testEmployeesNameStartingWithA() {
        app.employeesNameStartingWithA.accept(employeeFactory.getAllEmployee());
    }

    @Test
    void testGetEmployeesJoinedInYear() {
        List<Employee> actual = app.getEmployeesJoinedInYear.apply(employeeFactory.getAllEmployee(), "2023");

        Project Pegasus = new Project("Pegasus Model", "Data", "Vikram");
        Project Delta = new Project("Delta Model", "Login", "Robert Downey Jr");

        List<Employee> expected = new ArrayList<>(List.of(
                new Employee("2023Emp0934", "Shruti", "Sen", 1100000, 1, Arrays.asList(Pegasus)),
                new Employee("2023Emp1033", "Akshay", "Kumar", 1200000, 0, Arrays.asList(Delta))
        ));

        assertEquals(actual, expected);
        assertEquals(actual.size(), 2);
    }


    @Test
    void testSortEmployeesByNameThenSalary() {
        List<Employee> actual = app.sortEmployeesByNameThenSalary.apply(employeeFactory.getAllEmployee());

        List<Employee> employees = new ArrayList<>();

        Project Delta = new Project("Delta Model", "Login", "Robert Downey Jr");
        Project Beta = new Project("Beta Enhancement", "Authentication", "Chris");
        Project TwoFactorAuth = new Project("Two Factor Authentication", "Authentication", "MSD");
        Project CommonUI = new Project("Common UI", "UI", "Robert Downey Jr");
        Project Pegasus = new Project("Pegasus Model", "Data", "Vikram");
        Project CustomerOnboarding = new Project("Customer Onboarding", "Ads", "Vedha");
        Project Verification = new Project("Source Verification", "Data", "Pablo");
        Project RemoveUsers = new Project("Remove Invalid User", "Proxy", "Jeetu");
        Project SiteReliability = new Project("Site Reliability", "Admin", "Zaheer Khan");
        Project DataTransition = new Project("Data Transition", "Data", "Atif Aslam");
        Project TwoPhaseDeployment =new Project("Two Phase Deployment", "Deployment", "Shaktiman");

        employees.add(new Employee("2023Emp1033", "Akshay", "Kumar", 1200000, 0, Arrays.asList(Delta)));
        employees.add(new Employee("2022Emp0087", "Babu", "Rao", 900000, 1, Arrays.asList(TwoFactorAuth)));
        employees.add(new Employee("2015Emp0009", "Babu", "Dutt", 2600000, 2, Arrays.asList(Verification, RemoveUsers, TwoPhaseDeployment)));
        employees.add(new Employee("2020Emp0234", "Bhaskar", "Sharan", 900000, 1, Arrays.asList(Delta, Beta)));
        employees.add(new Employee("2017Emp00031", "Chris", "Martin", 2200000, 2, Arrays.asList(Delta, TwoFactorAuth)));
        employees.add(new Employee("2019Emp0050", "Dev", "Anand", 1300000, 1, Arrays.asList(RemoveUsers, CommonUI)));
        employees.add(new Employee("2012Emp1923", "Dev", "Sharma", 3500000, 3, Arrays.asList(Pegasus, CustomerOnboarding, Beta, SiteReliability)));
        employees.add(new Employee("2017Emp0721", "Priti", "Kabir", 1800000, 3, Arrays.asList(TwoFactorAuth, Beta, CommonUI)));
        employees.add(new Employee("2013Emp0872", "Sanjay", "Singhania", 2200000, 3, Arrays.asList(Pegasus, Delta, RemoveUsers, DataTransition)));
        employees.add(new Employee("2023Emp0934", "Shruti", "Sen", 1100000, 1, Arrays.asList(Pegasus)));

        assertEquals(employees, actual);
    }




}
