package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Positivo-1: ");
		int positivo1 = sc.nextInt();
		System.out.print("Positivo-2: ");
		int positivo2 = sc.nextInt();
		System.out.println();
		System.out.printf("positivo1: %d", (int) Math.pow(positivo1, positivo2));
		System.out.println();
		System.out.printf("positivo2: %d", (int) Math.pow(positivo2, positivo1));
		sc.close();

	}
}
