import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);/* Sem a virgula */
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char a;

		/* Lendo String */
		System.out.println("Digite nome 'nome': ");
		x = sc.next();
		System.out.println("Você digitou: " + x);

		/* Lendo numero */
		System.out.println("Digite número '100': ");
		y = sc.nextInt();
		System.out.println("Você digitou o número: " + y);

		/* Lendo ponto flutuante */
		System.out.println("Digite número '5.75': ");
		z = sc.nextDouble();
		System.out.println("Você digitou o número: " + z);

		/* Lendo caractere */
		System.out.println("Digite número 'V': ");
		a = sc.next().charAt(0);
		System.out.println("Você digitou o número: " + a);

		/* Lendo vários dados na mesma linha */
		System.out.println("Lendo vários dados na mesma linha:");
		System.out.println("nome numero numeroPontoFlutuante caractere");

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);

		sc.close();

	}

}
