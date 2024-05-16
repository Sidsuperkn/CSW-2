package question1;

import java.util.List;
import java.util.ArrayList;

public class BankApp {
	private List<Account> accountsList;
	
	public Account addAccount(int accountNumber) {
	    if (accountsList == null) {
	        accountsList = new ArrayList<>();
	    }
	    Account account = new Account();
	    account.setAccountNumber(accountNumber);
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
