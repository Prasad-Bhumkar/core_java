package ConstructorHomework;

public class Account {
    private int accNumber;
    private String accType;
    private double accBalance;

    public Account() {
    accNumber = 997585766;
    accType = "Saving";
    accBalance = 5000.0;
}

public Account(int number, String type, double balance) {
    
    accNumber = number;
    accType = type;
    accBalance = balance;
}

    public void printInfo() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + accBalance);
    }

}
