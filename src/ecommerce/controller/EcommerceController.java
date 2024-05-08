package ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import ecommerce.model.Produto;
import ecommerce.repository.EcomRepository;

public class EcommerceController implements EcomRepository {

    List<Produto> produtos = new ArrayList<>();

    
	@Override
	public void procurarProduto(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exibirDetalhes() {
		for (var produto : produtos) {
            produto.exibirDetalhes();		
	}
}

	@Override
	public void cadastrar(Produto produto) {
		produtos.add(produto);
		System.out.println("\nO produto ID: " + produto.getId() + " foi criado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
	var buscaProduto = buscarNaCollection(produto.getId());
		
		if (buscaProduto != null) {
			produtos.set(produtos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto ID : " + produto.getId() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto ID : " + produto.getId() + " nao foi encontrado!");
		
	}

	@Override
	public void deletar(int id) {
	var buscaProduto = buscarNaCollection(id);
		
		if (buscaProduto != null) {
			if(produtos.remove(buscaProduto) == true)
				System.out.println("\nO produto ID " + (id) + " foi deletado com sucesso!");
		} else 
			System.out.println("\nO produto ID " + (id) + " não foi encontrado!");
	}

	public Produto buscarNaCollection(int id) {
		for (var produto : produtos) {
			if (produto.getId() == id) {
				return produto;
	} 
}
		return null;
		
	}

	@Override
	public void procurarPorNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	
		
	}

			


