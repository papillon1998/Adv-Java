package functional_programming.firstClass_functions;

import java.util.function.BiFunction;

/*
* BiFunction<T,U,R>
    It represents a function that accepts two arguments and returns a result.
* */
public class BiFunctions {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add = (num1, num2) -> num1+num2;

        Integer res = add.apply(5,2);
        System.out.println(res);
    }
}
