package main;
import entities.Produtos;
import entities.Fornecedor;
import entities.Vendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tela {
	static List<Fornecedor> dbFornecedor = new ArrayList<>();
	static List<Produtos> dbProdutos = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		boolean i = true;
		
		while(i) {
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Cadastrar Fornecedor");
		System.out.println("3 - Listar Produtos");
		System.out.println("4 - Listar Fornecedores");
		System.out.println("5 - Registrar venda");
		System.out.println("6 - Registrar compra");
		System.out.println("0 - Sair");
		int escolha = ent.nextInt();
		clearBuffer(ent);
		
		switch(escolha) {
			case(1):{
				int cont = 0;
				System.out.print("Nome do produto: ");
				String nomeProd = ent.nextLine();
				System.out.print("Valor de venda: ");
				Double valorProd = ent.nextDouble();
				System.out.print("Estoque: ");
				Integer estoqueProd = ent.nextInt();
				
//				System.out.println("Codigo fornecedor");
//				Integer codForne = ent.nextInt();
				Produtos prod = new Produtos(nomeProd, valorProd, estoqueProd);
				dbProdutos.add(prod);
				
				System.out.println("Listar produtos?");
				System.out.println("1 - Sim, 2 - Não");
				Integer listar = ent.nextInt();
				if(listar == 1) {
					System.out.println("############################################################");
					for(Produtos p: dbProdutos) {
						cont = cont+1;
						System.out.println(cont+" - "+p.getNome()+ " em estoque: "+p.getEstoque());
					}
					System.out.println("############################################################");
				}
				break;
			}
			case(2):{
				int cont = 0;
				System.out.printf("Nome fornecedor: ");
				String nomeForne = ent.nextLine();
				
				System.out.printf("\nCEP: ");
				Integer cepForne = ent.nextInt();
				
				Fornecedor forn = new Fornecedor(nomeForne, cepForne);
				dbFornecedor.add(forn);
				System.out.println("############################################################");
				System.out.println("Fornecedores");
				for( Fornecedor f:dbFornecedor) {
					cont = cont +1;
					System.out.println(cont +" - "+f.getNome());
				}
				System.out.println("############################################################");
				break;
			}
			case(3):{
				int cont = 0;
				System.out.println("############################################################");
				for(Produtos p: dbProdutos) {
					cont = cont+1;
					System.out.println(cont+" - "+p.getNome()+ " em estoque: "+p.getEstoque());
				}
				System.out.println("############################################################");
				break;
			}
			case(4):{
				int cont=0;
				System.out.println("############################################################");
				System.out.println("Fornecedores");
				for( Fornecedor f:dbFornecedor) {
					cont = cont +1;
					System.out.println(cont +" - "+f.getNome());
				}
				System.out.println("############################################################");
				break;
			}
			case(5):{
				System.out.print("Codigo do produto: ");
				Integer codProd = ent.nextInt();
				System.out.print("Quantidade: ");
				Integer quanti = ent.nextInt();
				
				Vendas venda = new Vendas(codProd, quanti);
				dbProdutos.get(codProd-1).setEstoque(dbProdutos.get(codProd-1).getEstoque()-quanti);
				break;
			}
			case(6):{
				System.out.print("Codigo produto: ");
				Integer codProd = ent.nextInt();
				System.out.print("Quantidade comprada: ");
				Integer compra = ent.nextInt();
				dbProdutos.get(codProd-1).setEstoque(dbProdutos.get(codProd-1).getEstoque()+compra);
				break;
			}
			case(0):{
				i = false;
				break;
			}
			
		}
	}
	}
  private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
