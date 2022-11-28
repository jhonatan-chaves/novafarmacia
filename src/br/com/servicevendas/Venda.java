package br.com.servicevendas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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

	public double getSomaProdutos() {
		double somaProdutos = 0;
		for (Object produCarrinho : carrinho) {
			somaProdutos += produto.getPreco();
		}
		return somaProdutos + carrinho.size();
	}

	public void getProcurarProduto() {
		String nome5 = JOptionPane.showInputDialog("DIGITE O CODIGO");
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == Long.parseLong(nome5)) {
				System.out.println(produtos.get(i));
				carrinho.add(produtos.get(i));
				break;
			}
		}
	}
	public void getMostrarCarrinho() {
		System.out.println(carrinho.toString());
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", produto=" + produto + ", produtos=" + produtos + ", carrinho=" + carrinho + "]";
	}

	
	
	
}
