package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Salario base: R$");
		double salarioBase = sc.nextDouble();

		double gratificacao = salarioBase + (salarioBase * 0.05);
		double imposto = salarioBase - (salarioBase * 0.07);
		double novoSalario = (salarioBase + gratificacao) - imposto;
		System.out.println();
		System.out.printf("Novo salario: R$%.3f", novoSalario);

		sc.close();
	}

}
