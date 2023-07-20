package java11;

import java.util.Arrays;
import java.util.List;


public class Collection_to_array {
    public static void main(String[] args) {
        List sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);

    }


}
