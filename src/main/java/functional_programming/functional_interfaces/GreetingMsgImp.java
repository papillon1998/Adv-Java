package src.functional_programming.functional_interfaces;

public class GreetingMsgImp implements GreetingMsg {


    @Override
    public void greet(String name) {
        System.out.println("Hello");
    }
}
