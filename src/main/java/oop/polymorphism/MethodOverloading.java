package oop.polymorphism;

import java.util.List;

/*
In Java, Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.
Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.*/
public class MethodOverloading {
    /*uncomment this code; the method is not compiling. */
//    public long countFrequency(List<Integer> list, int valueTofind) {
//        return list.stream()
//                .filter(num -> num.equals(valueTofind))
//                .count();
//    }

    public long countFrequency(List<Long> list, int valueToFind) {
        return list.stream()
                .filter(num -> num == valueToFind)
                .count();
    }
}
