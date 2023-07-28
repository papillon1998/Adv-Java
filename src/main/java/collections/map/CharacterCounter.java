package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounter {
    public static Map<Character, Integer> countChars(String string) {
        return string.chars()
                .filter(c -> c != ' ') // Exclude space characters
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                        c -> c,
                        c -> 1,
                        Integer::sum,
                        HashMap::new
                ));
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        Map<Character, Integer> charCountMap = countChars(input);
        System.out.println(charCountMap);
    }
}

