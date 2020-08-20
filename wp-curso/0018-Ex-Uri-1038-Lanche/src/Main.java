import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod, quantidade;
		double preco = 0;

		cod = sc.nextInt();
		quantidade = sc.nextInt();

		if (cod == 1) {
			preco = quantidade * 4.00;
		} else if (cod == 2) {
			preco = quantidade * 4.50;
		} else if (cod == 3) {
			preco = quantidade * 5.00;
		} else if (cod == 4) {
			preco = quantidade * 2;
		} else if (cod == 5) {
			preco = quantidade * 1.50;
		}else {
			System.out.println("Execute o programa novamente.");
		}
		
		System.out.printf("Total: R$%.2f", preco);
		 sc.close();

	}
}
