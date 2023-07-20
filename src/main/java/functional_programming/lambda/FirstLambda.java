package src.functional_programming.lambda;

public class FirstLambda {

	public static void main(String[] args) {

		User Sarah = new User("Sarah");
		User James = new User("James");
		User Joo = new User("Joo");
		User Jack = new User("Jack");


		Math math = num -> num<0? -num: num;
		System.out.println(math.absValue(-23));
	}



}
