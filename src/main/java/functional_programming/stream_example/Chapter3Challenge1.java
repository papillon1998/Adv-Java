package src.functional_programming.stream_example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Functional Programming with Java
    Challenge: Stream exercises
* */
public class Chapter3Challenge1 {
    static class Person {
        public final String name;
        public final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Car {
        public final String make;
        public final String color;
        public final Float price;

        public Car(String make, String color, Float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }
    }

    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Person[] peopleArr = {
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27),
        };
        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

        // return a list of all people with their names

        List<String> names = people.stream()
                .map(person -> person.name)
                .collect(Collectors.toList());


        Car[] carsArr = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 150000f),
        };
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        // return a list of all blue cars

        List<Car> blueCars = cars.stream().filter(car -> car.color=="blue").collect(Collectors.toList());


        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        // return total salary
        Float totalSalary = employees.stream().map(emp -> emp.salary).reduce(0F, (acc, s) -> acc+s);
//        Double totalSalary = employees.stream().map(emp -> emp.salary).collect(Collectors.summingDouble(s -> s)) ;

        // return the average salary of developers
        Predicate<Employee> develpers = employee -> employee.jobTitle.equals("developer");

        Double averageDevSalary = employees.stream()
                .filter(emp -> emp.jobTitle.equals("developer"))
                .mapToDouble(emp -> emp.salary).summaryStatistics()
                .getAverage();
//        System.out.format(String.format("%.2f", averageDevSalary));

        //compare salary of dev vs non-dev

        Map<String, List<Employee>> employeesMap = employees.stream().collect(Collectors.groupingBy(emp -> emp.jobTitle));
        System.out.println(employeesMap.entrySet());

        Map<String, Double> salariesMap = employees.stream().collect(Collectors.groupingBy(emp -> emp.jobTitle))
                .entrySet().stream().collect(Collectors.toMap(k -> k.getKey(),
                        v -> v.getValue().stream().mapToDouble(emp -> emp.salary).summaryStatistics().getAverage()));

        System.out.println(salariesMap);
    }
}
