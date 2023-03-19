package br.com.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.servicepessoa.Cliente;
import br.com.serviceproduto.Produto;

public class App {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Object> carrinho = new ArrayList<Object>();

		var produto1 = new Produto(001L, "dipirona", "medley", 25.60);
		produtos.add(produto1);
		var produto2 = new Produto(002L, "losartana", "teuto", 94.12);
		produtos.add(produto2);
		var produto3 = new Produto(003L, "dorflex", "neoQuimica", 7.32);
		produtos.add(produto3);

		var cliente1 = new Cliente(001L, "jhonatan");
		clientes.add(cliente1);

		// System.out.println(produtos.get(0));

		// System.out.println(produtos.get(((int)3L) -1));
		while (true) {
			String procurarProduto = JOptionPane.showInputDialog(" 1/codigo ou 2/nome");

			if (Integer.valueOf(procurarProduto) == 1) {
				
				                      //int i = 0; i < produtos.size(); i++
				 while (true) {
					 boolean valorInvalido;
					 valorInvalido = false;
					 
					 String id = JOptionPane.showInputDialog("codigo do produto?");
                     try {
                     if (Integer.parseInt(id) != 123) {
                    	 
                    	 carrinho.add(produtos.get((int)Long.parseLong(id)-1));
                    	 break;
                     }
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, " codigo : " + id + " não escontrado");
							valorInvalido = true;
							break;
						}
                    	
                     } 
                 
				
					
					System.out.println("valor encontrado");
					
				
				
			} else {
				String nome = JOptionPane.showInputDialog("nome do produto?");
				for (int i = 0; i < produtos.size(); i++) {

					if (produtos.get(i).getNome() == nome.intern()) {
						// System.out.println(produtos.get(i));
						carrinho.add(produtos.get(i));
						break;
					}

				}
			}
			System.out.println(carrinho.toString());

			carrinho.clear();
			System.out.println(carrinho.toString());

		}

		/*
		 * for (Produto produto : produtos) { System.out.println(produto.getId()+" " +
		 * produto.getNome()+ " "+ produto.getPreco() ); }
		 */

	}

}
