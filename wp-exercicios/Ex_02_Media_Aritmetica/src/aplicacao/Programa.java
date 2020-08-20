package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("nota1: ");
		float nota1 = sc.nextFloat();
		System.out.print("nota2: ");
		float nota2 = sc.nextFloat();
		System.out.print("nota3: ");
		float nota3 = sc.nextFloat();

		float media = (float) ((nota1 + nota2 + nota3) / 3.0);

		System.out.printf("media aritmetica: media %.2f", media);

		sc.close();
	}
}
