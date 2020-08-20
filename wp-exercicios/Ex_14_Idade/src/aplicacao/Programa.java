package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		System.out.printf("Ano atual: ");
		int anoAtual = sc.nextInt();

		int idade = anoAtual - anoNascimento;

		System.out.println("a) a idade dessa pessoa: " + idade + " anos.");
		System.out.println("b) quantos anos ela terá em 2050: " + (2050 - anoNascimento)+" anos.");

		sc.close();
	}
}
