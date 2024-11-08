package MethodOverloading;

public class Subtraction {

    // Method to subtract two integers
    public int subtract(int a, int b) {
        // Return the result of subtracting b from a
        return a - b;
    }

    // Method to subtract two double numbers
    public double subtract(double a, double b) {
        // Return the result of subtracting b from a
        return a - b;
    }

    // Method to subtract three integers
    public int subtract(int a, int b, int c) {
        // Return the result of subtracting b and c from a
        return a - b - c;
    }
}