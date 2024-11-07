package introduction_to_java;

public class Account {
    private int accNumber;
    private String accType;
    private double balance;

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccBalance(double balance) {
        this.balance = balance;
    }

    public double getAccBalance() {
        return balance;
    }
}