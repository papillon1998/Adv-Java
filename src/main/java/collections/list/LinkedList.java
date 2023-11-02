package collections.list;

import java.util.Comparator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        List<Integer> numberList = List.of(6,7,8,9,10,1,2,3,4,5);

//        numberList.stream()
//                .sorted(Comparator.naturalOrder())
//                .toList()
//                .forEach(System.out::println);

        numberList.add(11);

        numberList.remove(0);

        numberList.stream().forEach(System.out::println);

    }
}
