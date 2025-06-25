package bankaccount;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance = 0.0;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance; 
    }

 
    public String deposit(double amount) {
        if (amount > 0) {
            balance += amount; 
            return String.format("Deposited: $%.2f. New Balance: $%.2f", amount, balance);
        } else {
            return "Deposit must be positive.";
        }
    }

    
    public String withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return String.format("Withdrew: $%.2f. New Balance: $%.2f", amount, balance);
        } else if (amount > balance) {
            return "Insufficient funds.";
        } else {
            return "Withdrawal amount must be positive.";
        }
    }

    
    public String getAccountInfo() {
        return String.format("Account Holder: %s, Account Number: %s, Balance: $%.2f", 
                             accountHolder, accountNumber, balance);
    }

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("20-1345-2025", "Rico");

        
        System.out.println(account.getAccountInfo());

        
        System.out.println(account.deposit(500.00));
        
        System.out.println(account.withdraw(200.00));
        System.out.println(account.withdraw(400.00));

      // Display account information again
        System.out.println(account.getAccountInfo());
    }
}
