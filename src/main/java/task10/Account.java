package task10;


	public class Account {
	    // Attributes
	    private int accountNumber;
	    private double balance;

	    // No-argument constructor
	    public Account() {
	        this.accountNumber = 0;
	        this.balance = 0.0;
	    }

	    // Constructor with account number and balance arguments
	    public Account(int accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    // Getter for account number
	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    // Getter for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Method to deposit amount
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }

	    // Method to withdraw amount
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance");
	        } else {
	            System.out.println("Invalid withdraw amount");
	        }
	    }

	    // Method to check balance
	    public void checkBalance() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: $" + balance);
	    }

	    public static void main(String[] args) {
	        // Creating an Account instance using no-argument constructor
	        Account account1 = new Account();
	        account1.checkBalance();

	        // Creating an Account instance using constructor with account number and initial balance
	        Account account2 = new Account(12345, 1000.0);
	        account2.checkBalance();

	        // Depositing amount
	        account2.deposit(500.0);
	        account2.checkBalance();

	        // Withdrawing amount
	        account2.withdraw(300.0);
	        account2.checkBalance();

	        // Trying to withdraw more than the current balance
	        account2.withdraw(1500.0);
	        account2.checkBalance();
	    }
	}



