package question1;

public class Account {
	private int accountNumber;
	private double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
	    this.balance += amount;
	}
	public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
	@Override
	public String toString() {
	    return "AccountNumber: " + accountNumber + ", Balance: " + balance;
	}
}
