package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Deposito: R$");
		double deposito = sc.nextDouble();
		System.out.print("Taxa de Juros: %");
		double taxaJuros = sc.nextDouble();

		double rendimento = (deposito / 100.0) * taxaJuros;
		double total = rendimento + deposito;

		System.out.printf("Valor do rendimento: R$%.3f", rendimento);
		System.out.println();
		System.out.printf("Valor total depois do rendimento: R$%.3f", total);

		sc.close();

	}

}
