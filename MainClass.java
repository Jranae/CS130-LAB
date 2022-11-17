package Inheritance;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object of the subclass
		Dog labrador= new Dog();
		//access field of superclass
		labrador.name="Polo";
		labrador.display();
		
		//call method of superclass
		//using object of subclass
		labrador.eat();
		
		Cat Orange= new Cat();
		Orange.name="Garfield";
		Orange.display();
		Orange.sleep();
		
		Rabbit Fat = new Rabbit();
		Fat.name= "Fat Rabbit";
		Fat.display();
		Fat.play();
		
		
	}

}
