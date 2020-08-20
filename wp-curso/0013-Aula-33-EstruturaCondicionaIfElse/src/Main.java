import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 5;
		/*
		 * Estrutura Condicional Simples V: Executa o bloco de comandos F: Pula o bloco
		 * de comandos
		 */
		System.out.println("Estrutura condicional simples");
		System.out.println("Bom dia");
		if (x < 0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Boa noite");

		System.out.println();

		System.out.println("Estrutura condicional composta");
		/*
		 * V: executa somente o bloco do if F: executa somente o bloco do else
		 */
		int hora;
		System.out.print("Quantas horas: ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa tarde");
		}
		System.out.println();
		/*
		 * Encadeamento de estruturas condicionais
		 * 
		 */
		System.out.println("Encadeamento de estruturas condicionais");
		System.out.println();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();

	}

}
