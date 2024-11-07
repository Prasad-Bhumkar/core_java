package ConstructorHomework;

public class MainAccount {
    public static void main(String[] args) {

        Account a1 = new Account();
        
        a1.printInfo();
        
        Account a2 = new Account(3687377,"current",890000);
        
        a2.printInfo();
    }

}