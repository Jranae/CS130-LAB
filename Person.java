package Lab;

public class Person {

	private String name;
	private int age= 0;
	
	public Person(String initialName) {
		this.name=initialName;
		this.age=0;
	}
	public Person(String initialName, int age) {
		this.name=initialName;
		this.age=age;
	}
	public void printPerson() {
		System.out.println(this.name + " Name " + this.age + " Age");
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
