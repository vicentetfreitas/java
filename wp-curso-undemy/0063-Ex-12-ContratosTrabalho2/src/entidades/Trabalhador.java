package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelDoTrabalhador;

public class Trabalhador {

	private String nome;
	private Double baseSalarial;

	private NivelDoTrabalhador nivel;
	private static Departamento departamento;

	private static List<ContratoPorHora> contratos = new ArrayList<>();

	public Trabalhador() {
	}

	
	public Trabalhador(String nome, Double baseSalarial, NivelDoTrabalhador nivel, Departamento departamento) {
		super();
		this.nome = nome;
		this.baseSalarial = baseSalarial;
		this.nivel = nivel;
		Trabalhador.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getBaseSalarial() {
		return baseSalarial;
	}


	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}


	public NivelDoTrabalhador getNivel() {
		return nivel;
	}


	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}


	public static Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		Trabalhador.departamento = departamento;
	}


	public List<ContratoPorHora> getContratos() {
		return contratos;
	}


	public void setContratos(List<ContratoPorHora> contratos) {
		Trabalhador.contratos = contratos;
	}


	public static void adicionarContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {
		double soma = baseSalarial;
		Calendar calendario = Calendar.getInstance();

		for (ContratoPorHora c : contratos) {
			calendario.setTime(c.getData());

			int c_ano = calendario.get(Calendar.YEAR);
			int c_mes = 1 + calendario.get(Calendar.MONTH);

			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}

}
