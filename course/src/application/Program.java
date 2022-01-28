package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		String initialDeposit = sc.next().substring(0);

		double initialDepositValue;
		if (initialDeposit.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			initialDepositValue = sc.nextDouble();
		} else {
			initialDepositValue = 0;
		}
		
		Conta account = new Conta(accountNumber, accountHolder, initialDepositValue);

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println(account);

		sc.close();
	}

}
