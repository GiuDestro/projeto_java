package ecommerce.model;

import java.util.ArrayList;

public abstract class Produto {
	
	    private int id;
	    private String nome;
	    private double preco;
		public Produto(int id, int tipo, String nome, double preco) {
			this.id = id;
			this.nome = nome;
			this.preco = preco;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
			
		}public abstract void exibirDetalhes();
		
}
		
 
		
	
		
	