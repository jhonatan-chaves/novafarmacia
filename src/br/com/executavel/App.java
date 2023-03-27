package br.com.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.servicepessoa.Cliente;
import br.com.serviceproduto.Produto;
import br.com.servicevendas.Venda;

public class App {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<Cliente>();

		Venda venda = new Venda();

		var produto1 = new Produto(001L, "dipirona", "medley", 25.60);
		// produtos.add(produto1);
		venda.getProdutos().add(produto1);
		var produto2 = new Produto(002L, "losartana", "teuto", 94.12);
		venda.getProdutos().add(produto2);
		var produto3 = new Produto(003L, "dorflex", "neoQuimica", 7.32);
		venda.getProdutos().add(produto3);

		var cliente1 = new Cliente(001L, "jhonatan");
		clientes.add(cliente1);

		while (true) {

			String procurarProduto = JOptionPane.showInputDialog(" 1/codigo ou 2/nome");
			switch (procurarProduto) {

			case "1":

				venda.carrinhoCompras();

				break;

			case "2":

				venda.carrinhoComprasN();

				break;

			}

		}
	}
}
