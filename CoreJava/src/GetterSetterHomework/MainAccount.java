package GetterSetterHomework;

import introduction_to_java.Account;

public class MainAccount {
    public static void main(String[] args) {

        Account a1 = new Account();
        
        a1.setAccNumber(654343531);
        a1.setAccType("saving");
        a1.setAccBalance(55000);
        
        int number = a1.getAccountNumber();
        String type = a1.getAccType();
        double balance = a1.getAccBalance();

        System.out.println("Account Details:");
        System.out.println("Account Number: " + number);
        System.out.println("Account Type: " + type);
        System.out.println("Account Balance: " + balance);
        
        
    }

}