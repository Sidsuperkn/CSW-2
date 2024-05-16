package question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
	private int accountNumber;
	private double balance;
	
	Account(int accountNumber){
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	public int getAccountNumber() {
		return accountNumber;
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

class BankApp {
	private List<Account> accountsList;
	
	BankApp(){
		accountsList = new ArrayList<>();
	}
	
	public Account addAccount(int accountNumber) {
		Account account = new Account(accountNumber);
	    accountsList.add(account);
	    return account;
	}
	
	public boolean deleteAccount(int accountNumber) {
        if (accountsList != null) {
            for (Account account : accountsList) {
                if (account.getAccountNumber() == accountNumber) {
                    accountsList.remove(account);
                    return true;
                }
            }
        }
        return false;
    }

    public Account getAccount(int accountNumber) {
        if (accountsList != null) {
            for (Account account : accountsList) {
                if (account.getAccountNumber() == accountNumber) {
                    return account;
                }
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accountsList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("BankApp Accounts:\n");
        if (accountsList != null) {
            for (Account account : accountsList) {
                result.append(account).append("\n");
            }
        }
        return result.toString();
    }
}

public class _2241011191_Ass1_Q4_1 {

	public static void main(String[] args) {
		BankApp bankApp = new BankApp();

	    Account account1 = bankApp.addAccount(1001);
	    Account account2 = bankApp.addAccount(1002);

	    account1.deposit(500.0);
	    account2.deposit(1000.0);
	    
	    account1.withdraw(200.0);
	    account2.withdraw(500.0);
	    
	    System.out.println("\nAll Accounts in the Bank:");
	    for (Account account : bankApp.getAllAccounts()) {
	           System.out.println(account);
	    }

	    bankApp.deleteAccount(1001);

	    System.out.println("\nAll Accounts in the Bank after deletion:");
	    for (Account account : bankApp.getAllAccounts()) {
	    	System.out.println(account);
	    }

	    Scanner sc = new Scanner(System.in);
	    System.out.print("\nEnter account number to retrieve: ");
	    int accountNumberToRetrieve = sc.nextInt();
	    Account retrievedAccount = bankApp.getAccount(accountNumberToRetrieve);
	    if (retrievedAccount != null) {
	    	System.out.println("Retrieved Account: " + retrievedAccount);
	    } else {
	    	System.out.println("Account not found.");
	    }
	    sc.close();
	}

}
