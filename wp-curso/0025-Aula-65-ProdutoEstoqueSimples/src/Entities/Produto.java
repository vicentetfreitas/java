package Entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

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
		return nome + ", $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ "
				+ String.format("%.2f", TotalValorEstoque());
	}
}
