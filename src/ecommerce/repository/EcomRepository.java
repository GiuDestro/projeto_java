package ecommerce.repository;

import ecommerce.model.Produto;

public interface EcomRepository {

	// Fazendo o CRUD (Create, Read, Update e Delete) dos dados	
		public void procurarProduto(int id);
		public void exibirDetalhes();
		public void cadastrar(Produto produto);
		public void atualizar(Produto Produto);
		public void deletar(int id);
		
		void procurarPorNome(String nome);
		
}
