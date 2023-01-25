package br.com.executavel;

import br.com.serviceproduto.Produto;
import br.com.servicevendas.Venda;

public class AppTest {

	public static void main(String[] args) {

		var produto1 = new Produto(001L, "dorflex", "ems", 25);
		var produto2 = new Produto(002L, "dipirona", "neoquimica", 50.03);
		var produto3 = new Produto(003L, "alivium", "medley", 5.27);

		var venda = new Venda();

		venda.getProdutos().add(produto1);
		venda.getProdutos().add(produto2);
		venda.getProdutos().add(produto3);

		venda.getProcurarProduto();

		// venda.getCarrinho().toString();

		System.out.println(venda.getSomaProdutos());

	}

}
