import java.util.Scanner;

public class ATM {

    double balance;
    
    ATM(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit successful. \nCurrent balance: Rs" + balance);
        }else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. \nCurrent balance: Rs" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient funds. Unable to complete withdrawal.");
        }
    }
    public static void main(String[] args) {
        ATM a = new ATM(2000.345);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice!=4){
            System.out.println("\nATM Menu:\n1.CheckBalance\n2.Deposit\n3.Withdrawal\n4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: Rs" + a.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: Rs");
                    double depositAmount = sc.nextDouble();
                    a.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: Rs");
                    double withdrawalAmount = sc.nextDouble();
                    a.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Transaction Successfull. \nThank you!");
                    break;
            
                default:
                    System.out.println("Invalid choice. \nPlease enter a number between 1 and 4.");
                    
            }
            
        }
        sc.close();
    }
    
}
