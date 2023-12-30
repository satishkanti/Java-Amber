// import java.util.Scanner;

abstract class BankAccount {
    protected double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate){
        super(initialBalance);
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount + (amount * interestRate);
            System.out.println("Deposit successful. Current balance: Rs " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
        
    }

    @Override
    public void withdraw(double amount) {
         if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: Rs " + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient funds. Unable to complete withdrawal.");
        }
    }
        
}


class CurrentAccount extends BankAccount {

    private double overdraftLimit;
    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: Rs " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: Rs " + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            System.out.println("Exceeds overdraft limit. Unable to complete withdrawal.");
        }
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        SavingsAccount sa = new SavingsAccount(1000, 0.05);
        CurrentAccount ca = new CurrentAccount(2000, 500);

        System.out.println("----- Savings Account Operations -----");
        sa.deposit(500);
        sa.withdraw(700);
        System.out.println("Current Balance: Rs " + sa.getBalance());

        System.out.println("\n----- Current Account Operations -----");
        ca.deposit(1000);
        ca.withdraw(2500);
        System.out.println("Current Balance: Rs " + ca.getBalance());

    }
}

