package teste;

import cadastro.CadastroProduto;

public class TesteCadastro {

	public static void main(String[] args) {

		System.out.println("#######CADASTRO DE PRODUTO#######");

		CadastroProduto cadastro = new CadastroProduto();
		cadastro.cadastrar();
		cadastro.listaProdutos();

	}

}
