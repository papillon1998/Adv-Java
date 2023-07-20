package src.functional_programming.functional_interfaces;

//funtional Interface(SAM): An interface that contains exactly one abstract method.

@FunctionalInterface
public interface GreetingMsg {
    void greet(String name);
}
