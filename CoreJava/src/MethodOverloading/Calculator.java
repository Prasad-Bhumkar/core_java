package MethodOverloading;

public class Calculator {
	public static void main(String[] args) {
		// Perform addition operations
		System.out.println("Addition :");
		Addition a1 = new Addition();
		double result1 = a1.add(10, 20);
		System.out.println(result1);
		double result2 = a1.add(10.5, 20.7);
		System.out.println(result2);
		double result3 = a1.add(10, 20, 30);
		System.out.println(result3);

		// Perform subtraction operations
		System.out.println("Subtrction : ");
		Subtraction s1 = new Subtraction();
		double result4 = s1.subtract(10, 20);
		System.out.println(result4);
		double result5 = s1.subtract(10.5, 20.7);
		System.out.println(result5);
		double result6 = s1.subtract(10, 20, 30);
		System.out.println(result6);

		// Perform multiplication operations
		System.out.println("Multiplication : ");
		Multiplication m1 = new Multiplication();
		double result7 = m1.multiply(10, 20);
		System.out.println(result7);
		double result8 = m1.multiply(10.5, 20.7);
		System.out.println(result8);
		double result9 = m1.multiply(10, 20, 30);
		System.out.println(result9);

		// Perform division operations
		System.out.println("Division : ");
		Division d1 = new Division();
        double result10 = d1.divide(10.0, 2.0); 
        System.out.println(result10);
        double result11 = d1.divide(10, 2); 
        System.out.println(result11);
        double result12 = d1.divide(10.0, 2.0, 2.0); 
        System.out.println(result12);
        double result13 = d1.divide(10, 2, 2.0); 
        System.out.println(result13);

	}
}