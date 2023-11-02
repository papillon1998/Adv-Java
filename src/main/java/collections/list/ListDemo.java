package collections.list;

import collections.Movie;

import java.util.LinkedList;
import java.util.*;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {
        ListDemo list = new ListDemo();
        list.hashMapDemo();
    }

    private void arrayListDemo() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,2));
        List<Integer> ascendingList = list.stream().sorted().collect(Collectors.toList());
        List<Integer> descendingList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

         System.out.println("List: "+ list);
         System.out.println("Ascending List: "+ ascendingList);
         System.out.println("Descending List: "+ descendingList);
    }

    private void linkedListDemo() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,2));
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        linkedList.add(2, 10 );
        List<Integer> ascList = linkedList.stream().sorted().collect(Collectors.toList());

        System.out.println(linkedList);
        System.out.println("Ascending linkedList: "+ ascList);

    }

    private void priorityQueueDemp() {
        List<Integer> arr = Arrays.asList(1,2,3,4);
        Queue<Integer> queue = new PriorityQueue<>(arr);

        System.out.println(queue);
    }

    private void hashSetDemo() {

    }

//    HashMap is the implementation of Map, but it doesn't maintain any order.
    private void hashMapDemo() {
        Movie movie1 = new Movie(1, "Papillon");
        Movie movie2 = new Movie(2, "Mr. Nobody");
        Movie movie3 = new Movie(3, "Scarface");
        Movie movie4 = new Movie(3, "Pi");
        List<Movie> movies = new ArrayList<>(Arrays.asList(movie1, movie2, movie3, movie4));

//        movies.stream().map(movie -> movie.getTitle()).forEach(System.out::println);

        Map<Integer, List<Movie>> map =
                movies.stream().collect(Collectors.groupingBy(Movie::getSerialCode));

        map.entrySet().stream()
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));

    }

}
