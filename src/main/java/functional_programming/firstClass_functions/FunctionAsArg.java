package src.functional_programming.firstClass_functions;

import java.util.function.BiFunction;

public class FunctionAsArg {

    public static Integer add(Integer x ,Integer y) {
        return x+y;
    }

    public static Integer subtract(Integer x, Integer y) {
        return x-y;
    }

    public static Integer addSubtract(BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(2,3);
    }

    public static void main(String[] args) {
        Integer res = addSubtract(FunctionAsArg::add);
        System.out.println(res);
    }



}
