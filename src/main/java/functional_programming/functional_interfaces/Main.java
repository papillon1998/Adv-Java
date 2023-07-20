package src.functional_programming.functional_interfaces;

public class Main {
    public static void main(String[] args) {
        GreetingMsg greetingMsg = (name) -> {
            System.out.println("Hello " + name );
        };
        greetingMsg.greet("Nabil");
    }


}
