package scanner;

public class Person {
	private String name;
	private int age;
	private long phoneNumber;
	
	public Person(String name, int age, long phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		System.out.println("Person created. Name: " + name + ", Age: " + age + ", Phone Number: " + phoneNumber );
	}
	
}
