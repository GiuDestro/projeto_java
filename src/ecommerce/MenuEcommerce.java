package ecommerce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import ecommerce.controller.EcommerceController;
import ecommerce.model.Produto;
import ecommerce.model.ProdutoDigital;
import ecommerce.model.ProdutoFisico;
import ecommerce.util.Cores;

public class MenuEcommerce {

	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Giulia Destro");
		System.out.println("Generation Brasil - giulia.silva@genstudents.org");
		System.out.println("github.com/GiuDestro/projeto_java");
		System.out.println("*********************************************************");
	}
	public static void main(String[] args) {
		
		EcommerceController produtos = new EcommerceController();
		
		int id, opcao, tipo = 0;
		String nome, linkDownload;
		double preco, peso;
		
		System.out.println("\nCriar Produtos\n");
		
        // Exemplo de criação e utilização dos produtos
        ProdutoFisico produto1 = new ProdutoFisico(1, 1, "Calça", 79, 1);
        produtos.cadastrar(produto1);
        ProdutoDigital produto2 = new ProdutoDigital(2, 2, "E-book Full Stack", 19, "https://www.gen.com/ebook");
        produtos.cadastrar(produto2);
        ProdutoFisico produto3 = new ProdutoFisico(3, 1, "Chinelo", 59, 2);
        produtos.cadastrar(produto3);
        ProdutoDigital produto4 = new ProdutoDigital(3, 2, "Apostila Java", 35, "https://www.gen.com/apostila");
        produtos.cadastrar(produto4);
        
        produtos.exibirDetalhes();
                
        Scanner leia = new Scanner(System.in);
        
		while (true) {
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "\n*************************************************");
			System.out.println("                                                 ");
			System.out.println("                E-COMMERCE MARABRAZZ             ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("        1 - Criar produto                        ");
			System.out.println("        2 - Listar todos os produtos             ");
			System.out.println("        3 - Buscar produto por ID                ");
			System.out.println("        4 - Atualizar dados do produto           ");
			System.out.println("        5 - Apagar produto                       ");
			System.out.println("        6 - Sair                                 ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("Entre com a opçao desejada:                      ");
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros! ");
				leia.nextLine();
				opcao = 0;
			
			} if (opcao == 6) {
				System.out.println(Cores.TEXT_CYAN_BOLD + "\nMARABRAZZ - Preço baixo ninguém faz!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_CYAN +"Criar Produto\n\n");
				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();
				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				
				
				do {
					System.out.println("Digite o tipo de produto (1-Físico ou 2-Virtual): ");
					tipo = leia.nextInt();
				} while(tipo < 1 && tipo > 2);
					System.out.println("Digite o valor do produto (R$): ");
					preco = leia.nextInt();
					
				switch(tipo) {
				case 1 -> {
					System.out.println("Digite o peso do produto (não esqueça do descimal com .): ");
					peso = leia.nextFloat();
					produtos.cadastrar(new ProdutoFisico(id, tipo, nome, preco, peso));
				}
				case 2 -> {
					System.out.println("Digite o link do produto: ");
					linkDownload = leia.nextLine();
					produtos.cadastrar(new ProdutoDigital(id, tipo, nome, preco, linkDownload));
				}
			}
				
				
				keyPress();
				break;
			
			case 2:
				System.out.println(Cores.TEXT_CYAN +"Listar todos os produtos\n\n");
				produtos.exibirDetalhes();
				keyPress();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_CYAN +"Buscar produto - por ID\n\n");
				System.out.println("Digite o ID do produto desejado: ");
				id = leia.nextInt();
				
				produtos.procurarProduto(id);
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_CYAN +"Atualizar dados do Produto\n\n");
				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();
				var buscaProduto = produtos.buscarNaCollection(id);
				
				if(buscaProduto != null) {
					System.out.println("Digite o nome do produto: ");
					nome = leia.nextLine();
					System.out.println("Digite o nome do titular: ");
					leia.skip("\\R?");
					
					System.out.println("Digite o preço do produto: ");
					preco = leia.nextFloat();
					
					switch (id) {
						case 1 -> {
						System.out.println("Digite o peso do produto: ");
						peso = leia.nextFloat();
						
						produtos.atualizar(new ProdutoFisico(id,tipo, nome, preco, peso));
						}
						case 2 -> {
						System.out.println("Digite o link para download: "); 
						linkDownload = leia.nextLine();
						
						produtos.atualizar(new ProdutoDigital(id, tipo, nome, preco, linkDownload));
						}
						
					}
					
				}
						
					else {
					        System.out.println("Produto não encontrado!");
					}
				keyPress();
				break;
		
			case 5:
				System.out.println(Cores.TEXT_CYAN +"Apagar Produto\n\n");
				System.out.println("Digite o id do produto: ");
				id = leia.nextInt();
				
				produtos.deletar(id);
				}
			keyPress();
				break;
		}
		
		
	}
	

 public static void keyPress() {
	
	try {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		System.in.read();
		
	} catch (IOException e) {
		System.out.println("Você pressionou uma tecla diferente de Enter!");
	}
	
}

}


	


