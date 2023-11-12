package basics.immutable;

public class Main {

    public static void main(String[] args) {
        ImmutableClass immutable = new ImmutableClass();
        System.out.println(immutable.getName());
        System.out.println(immutable.getAge());

        immutable.setAge("31");

        System.out.println(immutable.getAge());
    }
}
