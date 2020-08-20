package entities;

public class Produto {
	/** Atributos */
	private String nome;
	private double preco;
	private int quantidade;

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

	/** Encapsulamento */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	/**
	 * public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
	 */

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
