import java.util.Scanner;
import java.util.Locale;
import Entities.Produto;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: R$");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();

		/** CONTRUTOR */
		Produto produto = new Produto(nome, preco, quantidade);

		/** Sobrecarga - Segundo Construtor */
		produto = new Produto(nome, preco);

		System.out.println();
		System.out.println(produto);
		/* ADICIONANDO PRODUTOS */

		System.out.println();
		System.out.println("Entre com o número de produtos para serem ADICIONADOS ao estoque: ");
		quantidade = sc.nextInt();

		produto.AdicionarProduto(quantidade);
		System.out.println("Dados Atualizados");
		System.out.println(produto);
		System.out.println();

		/* REMOVENDO PRODUTOS */
		System.out.println("Entre com o número de produtos para serem REMOVIDOS do estoque: ");
		quantidade = sc.nextInt();
		produto.RemoverProduto(quantidade);
		System.out.println("Dados Atualizados");
		System.out.println(produto);

		sc.close();
	}
}
