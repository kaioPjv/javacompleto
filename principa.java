import java.util.Scanner;

public class principa {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: ");
		int quantidadeDeProdutos = scanner.nextInt();
		
		scanner.nextLine();
		
				Estoque estoque = new Estoque();
				estoque.profiti = new profiti[quantidadeDeProdutos];	
		
		for (int i = 0; i < estoque.profiti.length; i++ ) {
			estoque.profiti[i] = new profiti();
			
			System.out.println("Produto " + (i+1));
			System.out.println("-------------------------------------");
			
			System.out.println("Descrição: ");
			estoque.profiti[i].descricaoP = scanner.nextLine();
			
			System.out.println("Quantidade de itens: ");
			estoque.profiti[i].quantidade = scanner.nextInt();
			
			scanner.nextLine();			
		}
		estoque.listaprofiti();
		
		estoque.totalDeprofiti();
		
		
		
		
		scanner.close();
	}

}
