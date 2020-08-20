import java.util.Scanner;
import java.util.Locale;

import Entities.Produto;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: R$");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();

		System.out.println();
		System.out.println(produto);
		/* ADICIONANDO PRODUTOS */

		System.out.println();
		System.out.println("Entre com o número de produtos para serem ADICIONADOS ao estoque: ");
		int quantidade = sc.nextInt();

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
