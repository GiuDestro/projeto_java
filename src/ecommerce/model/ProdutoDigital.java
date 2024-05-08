package ecommerce.model;

public class ProdutoDigital extends Produto {

	private String linkDownload;
	
	public ProdutoDigital(int id, int tipo, String nome, double preco) {
		super(id, tipo, nome, preco);
		this.linkDownload = linkDownload;
	
	}
	
public ProdutoDigital(int id, int tipo, String nome, double preco, String linkDownload) {
		super(id, tipo, nome, preco);
		this.linkDownload = linkDownload;
	}

	@Override
	public void exibirDetalhes() {
	System.out.println("Produto digital: " + getNome() + ", Preço: R$" + getPreco() + ", Link para download: " + linkDownload);
	}

	public String getLinkDownload() {
		return linkDownload;
	}

	public void setLinkDownload(String linkDownload) {
		this.linkDownload = linkDownload;
	}

}
