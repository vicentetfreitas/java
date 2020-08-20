package Entities;

public class Produto {
	/** Atributos */
	public String nome;
	public double preco;
	public int quantidade;

	/** Construtor */
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	/** get */
	public double TotalValorEstoque() {
		return quantidade * preco;
	}

	/** set */
	public void AdicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void RemoverProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", R$" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: R$"
				+ String.format("%.2f", TotalValorEstoque());
	}
}
