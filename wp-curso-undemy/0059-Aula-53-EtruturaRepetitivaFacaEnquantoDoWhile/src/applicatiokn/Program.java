package applicatiokn;

import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.println("Digite a temperatura em Celcius: ");
			double C = sc.nextDouble();

			double F = 9.0 * C / 5.0 + 32.0;

			System.out.printf("Equivale em Fahrenheit: %.1f%n", F);
			System.out.print("Desejar repetir s/n: ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();
	}
}
