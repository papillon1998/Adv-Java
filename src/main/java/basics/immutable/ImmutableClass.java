package basics.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableClass {

    private final String name = "John";
    private String age = "30";


    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}


class Test {
    public static void main(String[] args) {
//        final String name = "John";
//        name = "J";

        final List<String> strings = new ArrayList<>();
        System.out.println(strings.size());
        strings.add("A");
        System.out.println(strings.size());

    }
}
