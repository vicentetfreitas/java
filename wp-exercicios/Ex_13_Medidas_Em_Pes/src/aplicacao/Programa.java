package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Pés: ");
		double pes = sc.nextDouble();

		double polegada = pes * 12;
		double jarda = pes / 3.0;
		double milha = jarda / 1760;

		System.out.printf("a) polegadas: %.2f", polegada);
		System.out.println();
		System.out.printf("b) jardas: %.2f", jarda);
		System.out.println();
		System.out.printf("c) milhas: %.6f", milha);

		sc.close();
	}
}
