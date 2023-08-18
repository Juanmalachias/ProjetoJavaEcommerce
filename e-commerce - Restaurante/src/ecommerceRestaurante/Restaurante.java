package ecommerceRestaurante;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Restaurante.util.Cores;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>Descrição = new LinkedList<>();
		List<Double>preço1 = new LinkedList<>();
		PedidoRepository pedidorepository = new PedidoRepository();
		PedidoController pedidoController = new PedidoController(pedidorepository);
		
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		Scanner leia = new Scanner(System.in);
		int opcao=0,pedido=0,quantidade =0,preço=0,escolhas=0;
		String nome = null;
		
		double total = 0.00;	
		
		do {
			System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+
					"*******************************************************"); 
	System.out.println("*                                                     *");
	System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *");
	System.out.println("*               ⋆✦⋆ Gastronomic Magic ⋆✦⋆              *");
	System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *");
	System.out.println("*                                                     *");
	System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
	System.out.println("*                                                     *");
	System.out.println("* 1 - Entradas                                        *");
	System.out.println("*                                                     *");
	System.out.println("* 2 - Pratos principais                               *");
	System.out.println("*                                                     *");
	System.out.println("* 3 - Opções vegetarianas                             *");
	System.out.println("*                                                     *");
	System.out.println("* 4 - Sobremesas                                      *");
	System.out.println("*                                                     *");
	System.out.println("* 5 - Bebidas                                         *");
	System.out.println("*                                                     *");
	System.out.println("* 6 - Sair                                            *");
	System.out.println("*                                                     *");
	System.out.println("*                                                     *");
	System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
	System.out.println("      Posso começar explicando as opções do menu?      "+Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao<1||opcao>6) {
				System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*************************************************");
				System.out.println("*                                               *");
				System.out.println("*  Desculpe essa opção não está disponivel mais *\n*\t   poderia escolher opção?              *");
				System.out.println("*                                               *");
				System.out.println("*************************************************");
				System.out.println();
			}else {
			
			int formaDePagamento;
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+
		                   "*******************************************************"); 
		System.out.println("*                                                     *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *");
		System.out.println("*               ⋆✦⋆ Gastronomic Magic ⋆✦⋆              *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *"); 
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
		System.out.println("*\t    As nossas estradas são                    *");
		System.out.println("*                                                     *");
		System.out.println("* 1-Bruschetta de Tomate e Manjericão                 *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Fatias de pão italiano levemente tostadas,      "+Cores.TEXT_YELLOW_BOLD+"    *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"cobertas com tomate fresco, manjericão, alho     "+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"e azeite de oliva.          "+Cores.TEXT_YELLOW_BOLD+"                        *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$18,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 2-Carpaccio de Carne com Rúcula e Parmesão          *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Finas fatias de carne crua marinada, servidas com"+Cores.TEXT_YELLOW_BOLD+"   *"); 
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"rúcula, lascas de queijo parmesão e regadas com a"+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"zeite de limão."+Cores.TEXT_YELLOW_BOLD+"                                     *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$22,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 3-Camembert Grelhado com Geleia de Frutas Vermelhas *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Queijo Camembert derretido na grelha, acompanhado "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"de torradas crocantes e geleia caseira de "+Cores.TEXT_YELLOW_BOLD+"          *");	
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"frutas vermelhas "+Cores.TEXT_YELLOW_BOLD+"                                   *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$24,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 4-Rolinhos de Primavera com Molho Agridoce          *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Rolinhos recheados com legumes frescos e camarões,"+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"fritos até ficarem crocantes, servidos com molho "+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"agridoce."+Cores.TEXT_YELLOW_BOLD+"                                           *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$20,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 5-Sopa de Cebola Gratinada                          *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Sopa de cebola rica e reconfortante, coberta com"+Cores.TEXT_YELLOW_BOLD+"    *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"queijo derretido e crosta de pão gratinado."+Cores.TEXT_YELLOW_BOLD+"         *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$16,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
		System.out.println("       Digite o numero da entrada que deseja?          "+Cores.TEXT_RESET);
		System.out.println();
		
		pedido = leia.nextInt();
		System.out.println("* Desejar pedir quantas unidades desse item?          *");
		quantidade = leia.nextInt();
		
		switch(pedido) {
				case 1:
					preço = (int) (quantidade * 18.0f);					
					nome = "Bruschetta de Tomate e Manjericão";
					pedidoController.adicionarPedido(nome, preço);
				break;
				
				case 2:		
					preço = (int) (quantidade * 22.0f);
					nome = "Carpaccio de Carne com Rúcula e Parmesão";
					pedidoController.adicionarPedido(nome, preço);
				break;
				
				case 3:
					preço = (int) (quantidade * 24.0f);
					nome = "Camembert Grelhado com Geleia de Frutas Vermelhas";
					pedidoController.adicionarPedido(nome, preço);
				break;
				
				case 4:
					preço = (int) (quantidade * 20.0f);
					nome = "Rolinhos de Primavera com Molho Agridoce";
					pedidoController.adicionarPedido(nome, preço);
				break;
				
				case 5:					
					preço = (int) (quantidade * 16.0f);
					nome = "Sopa de Cebola Gratinada";
					pedidoController.adicionarPedido(nome, preço);
				break;
						
				}
		Descrição.add(nome);
		preço1.add((double) preço);
		total +=preço;
		System.out.println("Presione qualquer tecla para continuar...");
		leia.nextLine();
		leia.nextLine();
				break;
			case 2:
				System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+
		                   "*******************************************************"); 
		System.out.println("*                                                     *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *");
		System.out.println("*               ⋆✦⋆ Gastronomic Magic ⋆✦⋆              *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *"); 
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
		System.out.println("*\t\t    Pratos Principais                 *");
		System.out.println("*                                                     *");
		System.out.println("* 1-Bife de Filé Mignon com Molho de Vinho Tinto      *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Um suculento filé mignon grelhado servido com um "+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"rico molho de vinho tinto, acompanhado de batatas"+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"rústicas e legumes sazonais."+Cores.TEXT_YELLOW_BOLD+"                        *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$55,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 2-Salmão Grelhado com Risoto de Limão               *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Filé de salmão grelhado com uma crosta dourada,"+Cores.TEXT_YELLOW_BOLD+"     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"servido sobre um risoto de limão fresco, ervilhas"+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"e queijo parmesão."+Cores.TEXT_YELLOW_BOLD+"                                  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$48,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 3-Frango à Parmegiana                               *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Peito de frango empanado e frito, coberto com"+Cores.TEXT_YELLOW_BOLD+"       *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"molho de tomate caseiro e queijo derretido,"+Cores.TEXT_YELLOW_BOLD+"         *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"acompanhado de espaguete ao alho e óleo."+Cores.TEXT_YELLOW_BOLD+"            *");		
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$42,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 4-Costelas de Porco ao Molho Barbecue               *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Costelas de porco assadas lentamente, regadas "+Cores.TEXT_YELLOW_BOLD+"      *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"com molho barbecue defumado, servidas com batatas  "+Cores.TEXT_YELLOW_BOLD+" *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"assadas e coleslaw.  "+Cores.TEXT_YELLOW_BOLD+"                               *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$50,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 5-Risoto de Frutos do Mar                           *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Um delicioso risoto arborio cozido em caldo de"+Cores.TEXT_YELLOW_BOLD+"      *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"peixe, repleto de camarões suculentos, vieiras e "+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"lulas, finalizado com azeite de trufas.     "+Cores.TEXT_YELLOW_BOLD+"        *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$58,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
		System.out.println("             Deseja pedir prato principal?             "+Cores.TEXT_RESET);
		System.out.println();
		
		pedido = leia.nextInt();
		
		System.out.println("* Desejar pedir quantas unidades desse item?          *");
		quantidade = leia.nextInt();
		
				switch(pedido) {
				case 1:			
					preço = (int) (quantidade * 55.0f);
					nome ="Bife de Filé Mignon com Molho de Vinho Tinto";
					pedidoController.adicionarPedido(nome, preço);
				break;
				
				case 2:	
					preço = (int) (quantidade * 48.0f);
					nome = "Salmão Grelhado com Risoto de Limão";	
					pedidoController.adicionarPedido(nome, preço);
				break;
				
				case 3:
					preço = (int) (quantidade * 42.0f);
					nome = "Frango à Parmegiana";
					pedidoController.adicionarPedido(nome, preço);
				break;
				
				case 4:
					preço = (int) (quantidade * 50.0f);
					nome = "Costelas de Porco ao Molho Barbecue";
					pedidoController.adicionarPedido(nome, preço);
				break;
				
				case 5:
					preço = (int) (quantidade * 58.0f);
					nome = "Risoto de Frutos do Mar";
					pedidoController.adicionarPedido(nome, preço);
				break;
				}
				Descrição.add(nome);
				preço1.add((double) preço);
				total +=preço;
				System.out.println("Presione qualquer tecla para continuar...");
				leia.nextLine();
				leia.nextLine();
				break;
			case 3:
				System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+
		                   "*******************************************************"); 
		System.out.println("*                                                     *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *");
		System.out.println("*               ⋆✦⋆ Gastronomic Magic ⋆✦⋆              *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *"); 
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
		System.out.println("*\t\t Pratos Vegetarianos                  *");
		System.out.println("*                                                     *");
		System.out.println("* 1-Risoto de Cogumelos Selvagens                     *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Um cremoso risoto de arroz arbóreo cozido em "+Cores.TEXT_YELLOW_BOLD+"       *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"caldo de legumes, com uma variedade de cogumelos  "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"selvagens, finalizado com queijo parmesão.  "+Cores.TEXT_YELLOW_BOLD+"        *");		
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$32,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 2-Curry de Legumes com Leite de Coco                *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Um prato aromático de legumes frescos cozidos em  "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"um curry de especiarias, leite de coco e servido   "+Cores.TEXT_YELLOW_BOLD+" *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"com arroz basmati.                                 "+Cores.TEXT_YELLOW_BOLD+" *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$28,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 3-Lasanha de Abobrinha e Espinafre                  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Camadas de abobrinha e espinafre entre folhas de "+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"massa de lasanha, intercaladas com molho de tomate  "+Cores.TEXT_YELLOW_BOLD+"*");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"e queijo derretido.                                "+Cores.TEXT_YELLOW_BOLD+" *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$26,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 4-Hambúrguer de Grão-de-Bico com Batata Doce Frita  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Um hambúrguer saboroso feito com grão-de-bico e  "+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"temperos, servido em um pão integral com alface, "+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"tomate e acompanhado de batata doce frita.      "+Cores.TEXT_YELLOW_BOLD+"    *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$18,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 5-Tofu Grelhado com Quinoa e Vegetais Assados       *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Cubos de tofu marinados e grelhados, servidos   "+Cores.TEXT_YELLOW_BOLD+"    *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"sobre uma cama de quinoa cozida e vegetais    "+Cores.TEXT_YELLOW_BOLD+"      *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"coloridos assados.                           "+Cores.TEXT_YELLOW_BOLD+"       *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$24,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
		System.out.println("            Deseja pedir prato vegetariano?            "+Cores.TEXT_RESET);
		System.out.println();
				
		pedido = leia.nextInt();
		System.out.println("* Desejar pedir quantas unidades desse item?          *");
		quantidade = leia.nextInt();
		
		switch(pedido) {
		case 1:
			preço = (int) (quantidade * 32.0f);
			nome = "Risoto de Cogumelos Selvagens";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 2:
			preço = (int) (quantidade * 28.0f);
			nome = "Curry de Legumes com Leite de Coco";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 3:
			preço = (int) (quantidade * 26.0f);
			nome = "Lasanha de Abobrinha e Espinafre";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 4:
			preço = (int) (quantidade * 18.0f);
			nome = "Hambúrguer de Grão-de-Bico com Batata Doce Frita";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 5:
			preço = (int) (quantidade * 24.0f);
			nome = "Tofu Grelhado com Quinoa e Vegetais Assados";
			pedidoController.adicionarPedido(nome, preço);
		break;
		}
		Descrição.add(nome);
		preço1.add((double) preço);
		total +=preço;
		System.out.println("Presione qualquer tecla para continuar...");
		leia.nextLine();
		leia.nextLine();
				break;
			case 4:
				System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+
		                   "*******************************************************"); 
		System.out.println("*                                                     *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *");
		System.out.println("*               ⋆✦⋆ Gastronomic Magic ⋆✦⋆              *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *"); 
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
		System.out.println("*\t\t\tSobremesas                    *");
		System.out.println("*                                                     *");
		System.out.println("* 1-Torta de Chocolate Duplo                          *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Uma indulgente torta de chocolate com duas camadas:"+Cores.TEXT_YELLOW_BOLD+" *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"uma de bolo de chocolate macio e outra de ganache  "+Cores.TEXT_YELLOW_BOLD+" *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"de chocolate amargo, coberta com raspas de chocolate"+Cores.TEXT_YELLOW_BOLD+"*");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"e servida com uma bola de sorvete de baunilha.     "+Cores.TEXT_YELLOW_BOLD+" *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$14,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 2-Cheesecake de Frutas Vermelhas                    *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Uma fatia generosa de cheesecake cremoso, coberta "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"com um mix de frutas vermelhas frescas, como     "+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"morangos, framboesas e amoras.                    "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$16,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 3-Creme Brûlée de Baunilha                          *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Um delicado creme de baunilha coberto com uma  "+Cores.TEXT_YELLOW_BOLD+"     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"fina camada crocante de açúcar caramelizado,   "+Cores.TEXT_YELLOW_BOLD+"     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"servido com frutas da estação.                 "+Cores.TEXT_YELLOW_BOLD+"     *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$12,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 4-Tiramisu Clássico                                 *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Um clássico italiano feito com camadas de  "+Cores.TEXT_YELLOW_BOLD+"         *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"biscoitos de champanhe embebidos em café e creme   "+Cores.TEXT_YELLOW_BOLD+" *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"de mascarpone, polvilhado com cacau em pó.   "+Cores.TEXT_YELLOW_BOLD+"       *");		
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$15,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("*                                                     *");
		System.out.println("* 5-Sorvete de Matcha com Molho de Gengibre           *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"Uma bola de sorvete de chá matcha delicadamente   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"amargo, servida com um molho de gengibre levemente"+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"* "+Cores.TEXT_DARK_GRAY+"picante e crocantes de amêndoas.                  "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+"*"+Cores.TEXT_RED+"  Preço: R$10,00                                   "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
		System.out.println("              Deseja pedir Sobremesa?                  "+Cores.TEXT_RESET);
		System.out.println();
						
		pedido = leia.nextInt();
		System.out.println("* Desejar pedir quantas unidades desse item?          *");
		quantidade = leia.nextInt();
		
		switch(pedido) {
		case 1:
			preço = (int) (quantidade * 14.0f);
			nome = "Torta de Chocolate Duplo";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 2:
			preço = (int) (quantidade * 16.0f);
			nome = "Cheesecake de Frutas Vermelhas";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 3:
			preço = (int) (quantidade * 12.0f);
			nome = "Creme Brûlée de Baunilha";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 4:
			preço = (int) (quantidade * 15.0f);
			nome = "Tiramisu Clássico";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 5:
			preço = (int) (quantidade * 10.0f);
			nome = "Sorvete de Matcha com Molho de Gengibre";
			pedidoController.adicionarPedido(nome, preço);
		break;
		}
		Descrição.add(nome);
		preço1.add((double) preço);
		total +=preço;
		System.out.println("Presione qualquer tecla para continuar...");
		leia.nextLine();
		leia.nextLine();
				break;
			case 5:
				System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+
		                   "*******************************************************"); 
		System.out.println("*                                                     *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *");
		System.out.println("*               ⋆✦⋆ Gastronomic Magic ⋆✦⋆              *");
		System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *"); 
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
		System.out.println("*\t\t\tBebidas                       *");
		System.out.println("*  Bebidas não alcoólicas                             *");
		System.out.println("*                                                     *");
		System.out.println("* 1- Garrafa de água          500 ml"+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"        R$5,00 "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("* 2- Água com gás             500 ml"+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"        R$8,00 "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("* 3- Coca Cola                350 ml"+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"        R$6,00 "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("* 4- Guaraná Antarctica       350 ml"+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"        R$6,00 "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("* 5- Fanta Laranja            350 ml"+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"        R$6,00 "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("* 6- Fanta Uva                350 ml"+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"        R$6,00 "+Cores.TEXT_YELLOW_BOLD+"  *");
		System.out.println("*                                                     *");
		System.out.println("* Bebida alcoólicas                                   *");
		System.out.println("*                                                     *");
		System.out.println("* 7-Casillero del Diablo Cabernet Sauvignon"+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"R$85,00"+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println("* 8-Santa Helena Reservado Chardonnay      "+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"R$60,00"+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println("* 9-Concha y Toro Frontera Merlot          "+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"R$75,00"+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println("* 10-Yellow Tail Shiraz                    "+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"R$80,00"+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println("* 11-Casa Valduga Leopoldina Chardonnay    "+Cores.TEXT_YELLOW_BOLD+" "+Cores.TEXT_RED+"R$90,00"+Cores.TEXT_YELLOW_BOLD+"   *");
		System.out.println("*                                                     *");
		System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
		System.out.println("             Deseja pedir algum bebida?                "+Cores.TEXT_RESET);
		System.out.println();
				
		pedido = leia.nextInt();
		System.out.println("* Desejar pedir quantas unidades desse item?          *");
		quantidade = leia.nextInt();
		
		switch(pedido) {
		case 1:
			preço = (int) (quantidade * 5.0f);
			nome = "Garrafa de água";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 2:
			preço = (int) (quantidade * 8.0f);
			nome = "Água com gás";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 3:
			preço = (int) (quantidade * 6.0f);
			nome = "Coca Cola";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 4:
			preço = (int) (quantidade * 6.0f);
			nome = "Guaraná Antarctica";
			pedidoController.adicionarPedido(nome, preço);
		break;
		
		case 5:
			preço = (int) (quantidade * 6.0f);
			nome = "Fanta Laranja";
			pedidoController.adicionarPedido(nome, preço);
		break;
		case 6:
			preço = (int) (quantidade * 6.0f);
			nome = "Fanta Uva";
			pedidoController.adicionarPedido(nome, preço);
		break;
		case 7:
			preço = (int) (quantidade * 85.0f);
			nome = "Casillero del Diablo Cabernet Sauvignon";
			pedidoController.adicionarPedido(nome, preço);
		break;
		case 8:
			preço = (int) (quantidade * 60.0f);
			nome = "Santa Helena Reservado Chardonnay";
			pedidoController.adicionarPedido(nome, preço);
		break;
		case 9:
			preço = (int) (quantidade * 75.0f);
			nome = "Concha y Toro Frontera Merlot";
			pedidoController.adicionarPedido(nome, preço);
		break;
		case 10:
			preço = (int) (quantidade * 80.0f);
			nome = "Yellow Tail Shiraz";
			pedidoController.adicionarPedido(nome, preço);
		break;
		case 11:
			preço = (int) (quantidade * 90.0f);
			nome = "Casa Valduga Leopoldina Chardonnay";
			pedidoController.adicionarPedido(nome, preço);
		break;
		}
		Descrição.add(nome);
		preço1.add((double) preço);
		total +=preço;
		System.out.println("Presione qualquer tecla para continuar...");
		leia.nextLine();
		leia.nextLine();
				break;
				default:
					System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+
			                   "*******************************************************"); 
			System.out.println("*                                                     *");
			System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *");
			System.out.println("*               ⋆✦⋆ Gastronomic Magic ⋆✦⋆              *");
			System.out.println("*                 .·:*¨¨* ≈☆≈ *¨¨*:·.                 *"); 
			System.out.println("*                                                     *");
			System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
			System.out.println("*                   Valor da conta                    *");
					for (String descrição :Descrição ) {
						int descriçãoLength = descrição.length();
						int espaços = 52 - descriçãoLength;
						String formataDescrição = descrição +" ".repeat(espaços);
						System.out.println("* "+formataDescrição+"*");
					}
					System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
					String valortotal = "Total: " + nfMoeda.format(total);
				int valorTotalLength= valortotal.length();
					int espaçosTotal = 52 - valorTotalLength;
					valortotal += " ".repeat(espaçosTotal);
					System.out.println("* "+valortotal+"*");

					System.out.println();
					pedidoController.mostrarPedidos();
					
					System.out.println(Cores.TEXT_RESET);
					System.out.println("Deseja ajustar a quantidade de algum item? (S/N)");
					String ajustarQuantidade = leia.next();
					if (ajustarQuantidade.equalsIgnoreCase("S")) {
					    System.out.println("Digite o número do item que deseja ajustar:");
					    int itemSelecionado = leia.nextInt() - 1; 
					    System.out.println("Digite a nova quantidade:");
					    int novaQuantidade = leia.nextInt();

					    // Atualizar a quantidade do item no carrinho
					    double precoAntigo = preço1.remove(itemSelecionado); 
					    double novoPreco = (precoAntigo / quantidade) * novaQuantidade;
					    ;
						preço1.add(itemSelecionado, novoPreco); 

					    total = (total - precoAntigo) + novoPreco;
					    quantidade = novaQuantidade;

					    System.out.println("Quantidade ajustada com sucesso!");
					    
					    System.out.println();
						pedidoController.mostrarPedidos();
						
					}	

					// Perguntar ao usuário se deseja remover algum item
					System.out.println("Deseja remover algum item? (S/N)");
					String removerItem = leia.next();
					if (removerItem.equalsIgnoreCase("S")) {
					    System.out.println("Digite o número do item que deseja remover:");
					    int itemRemovido = leia.nextInt() - 1; 

					    if (itemRemovido >= 0 && itemRemovido < preço1.size()) {
					       
					        Descrição.remove(nome);
					        double valorRemovido = preço1.remove(itemRemovido);
					        total -= valorRemovido;

					        System.out.println("Item removido com sucesso!");
					    } else {
					        System.out.println("Índice inválido. Nenhum item removido.");
					    }
					}
					
					System.out.println();
					
					System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
					System.out.println("*                                                     *");
					System.out.println("*                 Formas de pagamento                 *");
					System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
					System.out.println("*                1 - Cartão de Crédito                *");
					System.out.println("*                2 - Cartão de Débito                 *");
					System.out.println("*                3 - Pix                              *");
					System.out.println("*                4 - Vale Refeição                    *");
					System.out.println("*                5 - Dinheiro                         *");
					System.out.println("*                0 - Sair                             *");
					System.out.println("*                                                     *");
					System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************"+Cores.TEXT_RESET);
					
					formaDePagamento = leia.nextInt();

				int pagamento;
				int formaDePagemento = 0;
				while(formaDePagemento >1 || formaDePagemento <6) {
				switch (formaDePagamento) {
					case 1 -> {
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
						System.out.println("* "+nfMoeda.format(total) + " pago no Cartão de Crédito.                *");
						System.out.println("*                                                     *");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println("*          Pressione qualquer tecla para sair         *");
						pagamento = leia.nextInt();

					}
					case 2 -> {
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
						System.out.println("* "+nfMoeda.format(total) + " pago no Cartão de Débito.                *");
						System.out.println("*                                                     *");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println("*          Pressione qualquer tecla para sair         *");
						pagamento = leia.nextInt();
					}
					case 3 -> {
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
						System.out.println("* "+nfMoeda.format(total) + " pago no Pix.                              *");
						System.out.println("*                                                     *");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println("*          Pressione qualquer tecla para sair         *");
						
						pagamento = leia.nextInt();

					}
					case 4 -> {
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
						System.out.println("* "+nfMoeda.format(total) + " pago no Vale Refeição.                    *");
						System.out.println("*                                                     *");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println("*          Pressione qualquer tecla para sair         *");
						pagamento = leia.nextInt();

					}
					case 5 -> {
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_WHITE_BACKGROUND+"*                                                     *");
						System.out.println("* "+nfMoeda.format(total) + " pago em Dinheiro.                         *");
						System.out.println("*                                                     *");
						System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
						System.out.println("*          Pressione qualquer tecla para sair         *");
						pagamento = leia.nextInt();

					}
					default -> System.out.println("Opção inválida!");
					}
				break;

				}
					
					System.out.println();
					System.out.println(Cores.TEXT_YELLOW_BOLD+Cores.ANSI_RED_BACKGROUND_BRIGHT+"*******************************************************");
					System.out.println("*                                                     *");
					System.out.println("*              Obrigado pela visita!	              *");
					System.out.println("*                  Volte sempre!	              *");
					System.out.println("*                                                     *");
					System.out.println("*******************************************************");
					System.out.println();
			}
			}
			
		}while (opcao != 6);
		
	
	}
}
