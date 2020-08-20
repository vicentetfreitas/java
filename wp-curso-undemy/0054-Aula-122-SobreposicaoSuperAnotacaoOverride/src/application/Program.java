package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account acc1 = new Account(1010, "Vicente", 1000.00);
		acc1.withdraw(500.00);
		System.out.println(acc1.getBalance());

		/* MAIS UM EXEMPLO DE UPCASTING */

		Account acc2 = new SavingsAccount(1020, "Freitas", 1000.0, 0.01);
		acc2.withdraw(500.00);
		System.out.println(acc2.getBalance());

		Account acc3 = new BusinessAccount(1003, "Teixeira", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

		sc.close();
	}
}
