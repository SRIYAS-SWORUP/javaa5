import java.util.*;

class Account {
    String customerName;
    int accountNumber;
    Account(String customerName, int accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class Savings_Account extends Account {
    int min_bal;
    int saving_bal;
    Savings_Account(String customerName, int accountNumber, int min_bal, int saving_bal) {
        super(customerName, accountNumber);
        this.min_bal = min_bal;
        this.saving_bal = saving_bal;
    }
    void show() {
        display();
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Saving Balance: " + saving_bal);
    }
}

class Account_details extends Savings_Account {
    int deposit;
    int withdrawl;
    Account_details(String customerName, int accountNumber, int min_bal, int saving_bal, int deposit, int withdrawl) {
        super(customerName, accountNumber, min_bal, saving_bal);
        this.deposit = deposit;
        this.withdrawl = withdrawl;
    }
    void show1() {
        show();
        System.out.println("Deposit: " + deposit);
        System.out.println("Withdrawal: " + withdrawl);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Account_details obj = new Account_details("Ravi", 12345, 1000, 5000, 2000, 1000);
        obj.show1();
    }
}
