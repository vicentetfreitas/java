package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n1: ");
		int n1 = sc.nextInt();
		System.out.print("n2: ");
		int n2 = sc.nextInt();
		System.out.print("n3: ");
		int n3 = sc.nextInt();
		System.out.print("s4: ");
		int n4 = sc.nextInt();

		int soma = n1 + n2 + n3 + n4;
		System.out.println("Soma = " + soma);

		sc.close();
	}

}
