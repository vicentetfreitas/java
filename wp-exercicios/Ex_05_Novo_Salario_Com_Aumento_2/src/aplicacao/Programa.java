package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Salário: R$");
		double salario = sc.nextDouble();
		System.out.print("Percentual de aumento: ");
		double percentualDeAumento = sc.nextDouble();

		double valorDoAumento = (salario * (percentualDeAumento / 100));
		double novoSalario = salario + valorDoAumento;

		System.out.println();
		System.out.printf("Valor do aumento: R$%.3f", valorDoAumento);
		System.out.println();
		System.out.printf("Novo salário: R$%.3f", novoSalario);

		sc.close();

	}

}
