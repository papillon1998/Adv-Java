package scanner;

import java.util.Scanner;

public class PersonCreator {

	public static void main(String[] args) {
//		to get instance of scanner that reads the user's input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name, age and phoen number.");
		String name = sc.next();
		int age = sc.nextInt();
		long phoneNumber = sc.nextLong();
		sc.close();
		
		Person p1 = new Person(name, age, phoneNumber);
		
	}

}
