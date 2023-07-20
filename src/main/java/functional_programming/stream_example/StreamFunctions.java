package src.functional_programming.stream_example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFunctions {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        BinaryOperator<Integer> getSum = (acc, x) -> {
            Integer res = acc+x;
            return res;
        };


    }

    public static List<Integer> map(List<Integer> arr) {

        Function<Integer, Integer> multiplyBy2 = x -> x*2;
        List<Integer> listOfDoubled = arr
                .stream()
                .map(multiplyBy2)
                .collect(Collectors.toList());

        return listOfDoubled;
    }

    public static List<Integer> filter(List<Integer> arr) {

        Function<Integer, Predicate<Integer>> isDivisible = (divisor) -> {
            return dividend -> dividend%divisor==0;
        };

        Predicate<Integer> isDivisibleBy3 = isDivisible.apply(3);
        List<Integer> divisibleBy3 = arr
                .stream()
                .filter(isDivisibleBy3)
                .collect(Collectors.toList());

        return divisibleBy3;
    }


    public static Integer reduce(List<Integer> arr) {
        BinaryOperator<Integer> getSum = (acc, x) -> {
            Integer res = acc+x ;
            System.out.println("acc: " + acc + ", x: " + x + ", res: " + res);
            return res;
        };

        Integer sum = arr
                .stream()
                .reduce(0, getSum);

        return sum;
    }


}
