package Lab;
import java.util.*;

public class Maths {

	public static double E = 2.718;
	public static double PI = 3.1415;
	private static Random randomNumberGenerator;
	
	private Maths() {}
	public static int getrandomNumber() {
		int number = randomNumberGenerator.nextInt();
		return number;
}
	public static int max(int num1, int num2) {
		return Math.max(num1,num2);
}
	public static long Max(long num1, long num2) {
		return Math.max(num1,num2);
}
	public static double sin(double num1) {
		return Math.sin(num1);
}
	public static double cos(double num1) {
		return Math.cos(num1);
}
	public static double log(double num1) {
		return Math.log(num1);
}
	public static double floor(double num1) {
		return Math.floor(num1);
	}
	public static double ceil(double num1) {
		return Math.ceil(num1);
	}
	public static double pow(double num1, double num2) {
		return Math.pow(num1,num2);
	}
	
}
