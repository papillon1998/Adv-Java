package oop.polymorphism.runtimepolymorphism;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();


        Engineer engineer = new Engineer();

        Employee engineer1 = new Engineer(); //polymorphism - object of child class can be referred by parent's reference variable
        

        employee.work();
        engineer.work();
        engineer1.work();

    }

}
