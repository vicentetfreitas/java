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
		System.out.println("Voc� digitou: " + x);

		/* Lendo numero */
		System.out.println("Digite n�mero '100': ");
		y = sc.nextInt();
		System.out.println("Voc� digitou o n�mero: " + y);

		/* Lendo ponto flutuante */
		System.out.println("Digite n�mero '5.75': ");
		z = sc.nextDouble();
		System.out.println("Voc� digitou o n�mero: " + z);

		/* Lendo caractere */
		System.out.println("Digite n�mero 'V': ");
		a = sc.next().charAt(0);
		System.out.println("Voc� digitou o n�mero: " + a);

		/* Lendo v�rios dados na mesma linha */
		System.out.println("Lendo v�rios dados na mesma linha:");
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
