package Inheritance;

public class Programmer extends Employee {
	int bonus = 10000; //Global
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		System.out.println("Programmer salary is: "+ p.salary);
		System.out.println("Bonus of Programmer is: "+ p.bonus);
	}

}
