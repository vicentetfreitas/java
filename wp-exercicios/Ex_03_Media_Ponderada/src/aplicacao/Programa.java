package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void maind(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Peso1: ");
		double peso1 = sc.nextDouble();
		System.out.print("Nota2: ");
		double nota2 = sc.nextDouble();
		System.out.print("Peso2: ");
		double peso2 = sc.nextDouble();
		System.out.print("Nota3: ");
		double nota3 = sc.nextDouble();
		System.out.print("Peso3: ");
		double peso3 = sc.nextDouble();

		double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

		System.out.printf("Media ponderada: %.2f", mediaPonderada);

		sc.close();
	}
}
