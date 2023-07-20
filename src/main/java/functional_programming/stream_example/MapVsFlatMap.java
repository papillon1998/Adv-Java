package src.functional_programming.stream_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        list.stream().map(x -> x*2).forEach(System.out::println);

        List<String> list1 = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

        // Using Stream flatMap(Function mapper)
//        list1.stream().flatMap(str -> Stream.of(str.charAt(2)))
//                        .forEach(System.out::println);



    }
}
