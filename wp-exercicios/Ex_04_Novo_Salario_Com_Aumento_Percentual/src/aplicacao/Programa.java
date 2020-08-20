package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Salário: ");
		double salario = sc.nextDouble();

		double novoSalario = salario + (salario * 0.25);
		System.out.printf("Novo salário: R$%.3f", novoSalario);
		sc.close();
	}

}
