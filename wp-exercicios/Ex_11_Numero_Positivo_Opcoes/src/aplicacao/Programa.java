package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Número positivo: ");
		int numeroPositivo = sc.nextInt();

		System.out.printf("Quadrado: %d", Math.pow(numeroPositivo, 2));
		System.out.printf("Cubo: %d", Math.pow(numeroPositivo, 3));
		System.out.printf("Raiz quadrada: %d", Math.sqrt(numeroPositivo));
		System.out.printf("Raiz quadrada: %d", Math.cbrt(numeroPositivo));

		sc.close();

	}

}
