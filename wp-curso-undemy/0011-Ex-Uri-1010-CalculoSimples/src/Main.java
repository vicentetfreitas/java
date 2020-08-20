import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		int cod1, cod2, numeroDePecas1, numeroDePecas2;
		double valorPeca1, valorPeca2;

		cod1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		cod2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();

		double total = ((numeroDePecas1 * valorPeca1) + (numeroDePecas2 * valorPeca2));
		System.out.printf("VALOR A PAGAR: R$%.2f", total);

		sc.close();
	}

}
