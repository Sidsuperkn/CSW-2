package question1;

import java.util.Scanner;

public class _2241011191_Ass1_Q1 {

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
