package br.com.serviceproduto;

public class Produto {

	private Long id;
	private String nome;
	private String fabricante;
	private double preco;

	public Produto() {

	}

	public Produto(Long id, String nome, String fabricante, double preco) {
		this.id = id;
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double calcularValor(double qtd) {
		return (int) qtd * this.preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", fabricante=" + fabricante + ", preco=" + preco + "]" + "\n";
	}

	
}
