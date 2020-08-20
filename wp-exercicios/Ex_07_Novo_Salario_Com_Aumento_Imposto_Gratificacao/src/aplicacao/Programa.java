package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Salario base: R$");
		double salarioBase = sc.nextDouble();

		double imposto = salarioBase * 0.10;
		double salarioReceber = (salarioBase + 50) - imposto;

		System.out.printf("Salário a receber: R$%.3f", salarioReceber);

		sc.close();

	}

}
