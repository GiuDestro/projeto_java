package ecommerce.model;

public abstract class Ecommerce {
	
	private int id;
	private String produto;
	private String nome;
	private String endereco;
	public Ecommerce(int id, String produto, String nome, String endereco) {
		this.id = id;
		this.produto = produto;
		this.nome = nome;
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
