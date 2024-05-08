package ecommerce;

import java.util.Scanner;

import ecommerce.util.Cores;

public class MenuEcommerce {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
			System.out.println("        6 - Inserir dados do cliente             ");
			System.out.println("        7 - Buscar clientes                      ");
			System.out.println("        8 - Apagar dados do cliente              ");
			System.out.println("        9 - Sair                                 ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("Entre com a opçao desejada:                      ");
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_CYAN_BOLD + "\nMARABRAZZ - Preço baixo ninguém faz!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_CYAN +"Criar Produto\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_CYAN +"Listar todos os produtos\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_CYAN +"Consultar produto - por ID\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_CYAN +"Atualizar dados do Produto\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_CYAN +"Apagar Produto\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_CYAN +"Inserir dados do cliente\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_CYAN +"Listar os clientes cadastrados\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_CYAN +"Apagar dados do cliente\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
		}
	}
}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Giulia Destro");
		System.out.println("Generation Brasil - giulia.silva@genstudents.org");
		System.out.println("github.com/GiuDestro/projeto_java");
		System.out.println("*********************************************************");
			
		}

	}


