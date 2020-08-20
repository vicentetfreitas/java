import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);/* Sem a virgula */
		Scanner sc = new Scanner(System.in);
		
		int numero;
		float numeroDeHoraTrabalhada,valorPorHoraTrabalhada;
		float salario;
		
		numero  = sc.nextInt();
		numeroDeHoraTrabalhada = sc.nextFloat();
		valorPorHoraTrabalhada = sc.nextFloat();		
		salario = valorPorHoraTrabalhada * numeroDeHoraTrabalhada;
		
		System.out.printf("NUMERO = ",numero);
		System.out.printf("SALARIO = U$ %.2f", salario);
		
		sc.close();
		
		
		
		
	}

}
