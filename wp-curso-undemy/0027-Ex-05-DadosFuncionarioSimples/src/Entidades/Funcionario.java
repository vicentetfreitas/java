package Entidades;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public String toString() {
		return nome + ", $" + String.format("%.2f" + salarioBruto);
	}
}
