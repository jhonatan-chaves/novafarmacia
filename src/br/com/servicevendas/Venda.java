package br.com.servicevendas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.executavel.App;
import br.com.serviceproduto.Produto;

public class Venda {

	public Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	List<Produto> produtos = new ArrayList<Produto>();

	List<Object> carrinho = new ArrayList<Object>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Object> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(List<Object> carrinho) {
		this.carrinho = carrinho;
	}

	public void getProcurarProduto() {
		for (int j = 0; j < 2; j++) {
			String nome5 = JOptionPane.showInputDialog("DIGITE O CODIGO");
			String qtd = JOptionPane.showInputDialog("qual a quantidade?");
			for (int i = 0; i < produtos.size(); i++) {
				if (produtos.get(i).getId() == Long.parseLong(nome5)) {
					// System.out.println(produtos.get(i));
					for (int k = 0; k < Integer.valueOf(qtd); k++) {

						carrinho.add(produtos.get(i));
						if (Integer.valueOf(qtd) >= 2) {
							System.out.println(produtos.get(i) + " \n" + "Qtd: " + qtd);

						} else {
							System.out.println(produtos.get(i));
						}

					}
					break;
				}
			}
		}
	}

	public void getMostrarCarrinho() {
		System.out.println(carrinho.toString());
	}

	public double getSomaProdutos() {
		double somaProdutos = 0;
		for (Object produtoCarrinho : carrinho) {
			somaProdutos += ((Produto) produtoCarrinho).getPreco();
		}

		return somaProdutos;
	}

	@Override
	public String toString() {
		return " carrinho=" + carrinho + "]";
	}

	public void carrinhoCompras() {
		while (true) {

			String id = JOptionPane.showInputDialog("codigo do produto?");

			try {
				if (Integer.parseInt(id) != 123) {

					carrinho.add(produtos.get((int) Long.parseLong(id) - 1));

					System.out.println(produtos.get((int) Long.parseLong(id) - 1));
					
					//System.out.println(getSomaProdutos());

				} else {
					break;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, " codigo : " + id + " não escontrado");

			}

		}

	}

	public void carrinhoComprasN() {
		String nome = JOptionPane.showInputDialog("nome do produto?");

		for (int i = 0; i < produtos.size(); i++) {

			if (produtos.get(i).getNome().equals(nome)) {
				// System.out.println(produtos.get(i));
				carrinho.add(produtos.get(i));
				System.out.println(produtos.get(i));
				//System.out.println(getSomaProdutos());

			}

		}

	}

}
