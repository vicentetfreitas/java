import java.util.Scanner;
import java.util.Locale;

/*Aula 37 - Sintaxe opcional Swith Case*/
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sabádo";
			break;
		default:
			dia = "Valor inválido";
			break;
		}

		System.out.println("Dia da semana: " + dia);

		sc.close();
	}
}
