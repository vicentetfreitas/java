import java.util.Scanner;

import Entities.Retangulo;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();

		System.out.println("Entre com a largura e altura do triângulo: ");
		System.out.println("Largura: ");
		r.largura = sc.nextDouble();
		System.out.println("Altura: ");
		r.altura = sc.nextDouble();
		System.out.println();

		System.out.printf("AREA = %.2f%n", r.area());
		System.out.printf("PERIMETER = %.2f%n", r.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", r.diagonal());
		
		sc.close();
	}

}
