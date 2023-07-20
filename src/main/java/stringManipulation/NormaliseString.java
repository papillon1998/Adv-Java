package stringManipulation;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class NormaliseString {

    public static void main(String[] args) {

        List<String> animals = Arrays.asList("CAT", " Girafe", "  ", "tiGer");
        List<String> normalisedAnimals = animals.stream()
                .filter(animal -> !animal.isBlank())
                .map(animal -> animal.trim().toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());

        System.out.println(normalisedAnimals);

    }


}
