package oop.polymorphism.runtimepolymorphism;


public class Engineer extends Employee{

    private String specialization;
    @Override
    public void work() {
        System.out.println("Engineer is working");
    }
}
