package cadastro;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

import produto.Produto;

@SuppressWarnings({})
public class CadastroProduto {

	private Collection<Produto> produtos = new HashSet<>();

	public void cadastrar() {
		String yes = "s";
		try (Scanner entrada = new Scanner(System.in)) {
			while ("s".equalsIgnoreCase(yes)) {
				System.out.println("SKU: ");
				String sku = entrada.nextLine();

				System.out.println("NOME: ");
				String nome = entrada.nextLine();

				Produto produto = new Produto(sku.toUpperCase(), nome.toUpperCase());
				if (produtos.contains(produto)) {
					System.err.println("Lista já contem esse produto");
					System.err.flush();
				} else {
					this.produtos.add(produto);
					System.out.println(produto.getNome() + " adicionado ");
				}
				System.out.println("Deseja adicionar mais algum produto?(s/n");
				yes = entrada.nextLine();
			}
		}
	}

	public void listaProdutos() {
		this.produtos.forEach(System.out::println);

	}

}
