package br.com.executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.servicepessoa.Cliente;
import br.com.serviceproduto.Produto;
import br.com.servicevendas.Venda;

public class App {

	public static void main(String[] args) {

		Scanner es = new Scanner(System.in);

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

		System.out.println("============================== SUPER FARMA ==============================\n");

		while (true) {

			JOptionPane.showMessageDialog(null, "digite um numero: \n 1 : para iniciar o programa. \n 9 : para fechar o programa.");
			
			String escolha1 = JOptionPane.showInputDialog("digite o numero desejado");

			switch (Integer.parseInt(escolha1)) {
			case 1:

				String operador = JOptionPane.showInputDialog("digite seu operador");
				String senha = JOptionPane.showInputDialog("digite sua senha");

				if (operador.equals("jhonatan") && senha.equals("212324")) {

					while (true) { // inicio carrinho de compras

						String procurarProduto = JOptionPane.showInputDialog(" 1/codigo ou 2/nome");
						switch (procurarProduto) {

						case "1":

							venda.carrinhoCompras();

							break;

						case "2":

							venda.carrinhoComprasN();

							break;

						}

					} // final do while de carrinho de compras
				}
				break;
			case 9:
				break;
			}  //final switch escolha1
			if (Integer.parseInt(escolha1) == 9){
                break;
			}
		} // final while principal
	}
}
