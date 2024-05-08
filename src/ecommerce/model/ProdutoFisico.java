package ecommerce.model;

public class ProdutoFisico extends Produto {

	private double peso;
	public ProdutoFisico(int id, int tipo, String nome, double preco) {
		super(id, tipo, nome, preco);
		this.peso = peso;
	}


	public ProdutoFisico(int id, int tipo, String nome, double preco, double peso) {
		super(id, tipo, nome, preco);
		this.peso = peso;
	}


	@Override
	public void exibirDetalhes() {
        System.out.println("Produto físico: " + getNome() + ", Preço: R$" + getPreco() + ", Peso: " + peso + " kg");

	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	}
	
