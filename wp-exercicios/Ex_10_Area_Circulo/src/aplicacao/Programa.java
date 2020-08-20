package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Raio: ");
		double raio = sc.nextDouble();

		double areaCirculo = Math.PI * Math.pow(raio, 2);

		System.out.printf("Area do circulo: %.3f", areaCirculo);
		sc.close();
	}

}
