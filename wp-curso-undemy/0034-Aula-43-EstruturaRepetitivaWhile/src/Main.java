import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
	}
}
