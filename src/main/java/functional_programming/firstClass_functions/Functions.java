package src.functional_programming.firstClass_functions;

import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {
        Function<Integer, Integer> absValue = val -> val<0? -val: val;

        Integer res = absValue.apply(-5);
        System.out.println(res);
    }
}
