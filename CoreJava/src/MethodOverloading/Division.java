package MethodOverloading;

public class Division {

    // Method to divide two numbers
    public double divide(double a, double b) {
        return a / b;
    }

    // Method to divide three numbers
    public double divide(double a, double b, double c) {
        return a / b / c;
    }

    // Method to divide two integers
    public int divide(int a, int b) {
        return a / b;
    }

    // Method to divide two integers and a double
    public double divide(int a, int b, double c) {
        return (a / b) / c;
    }

}