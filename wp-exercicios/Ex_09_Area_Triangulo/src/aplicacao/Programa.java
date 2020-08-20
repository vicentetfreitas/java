package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Base: ");
		double base = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();

		double area = (base * altura) / 2.0;

		System.out.printf("Area triangulo: %.3f", area);

		sc.close();

	}

}
