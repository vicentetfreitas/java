import java.util.Scanner;

import Entidades.Funcionario;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Taxa de imposto: ");
		funcionario.imposto = sc.nextDouble();

		sc.close();
	}
}
