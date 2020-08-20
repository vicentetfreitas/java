package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContratoPorHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelDoTrabalhador;

public class Programa {
	public static void main(String[] argrs) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.next();
		System.out.println("Digite os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.next();
		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.next();
		System.out.print("Base salarial: ");
		Double baseSalarioTrabalhador = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, baseSalarioTrabalhador,
				NivelDoTrabalhador.valueOf(nivelTrabalhador), new Departamento(nomeDepartamento));

		System.out.println("Quantos contratos com esse trabalhador ? ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.println("Insira o contrato nº" + i + "dados:");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorPorHora, horas);
			Trabalhador.adicionarContrato(contrato);
		}
		System.out.println();
		System.out.println("Digite o mês e o ano para calcular a renda (MM / AAAA): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));

		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + Trabalhador.getDepartamento().getNome());
		System.out.println("Renda por " + mesEAno + ": " + String.format("%.2f", trabalhador.renda(mes, ano)));

		sc.close();
	}
}
