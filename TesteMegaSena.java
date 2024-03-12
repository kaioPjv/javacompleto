import java.util.Scanner;

public class TesteMegaSena {
	
	 public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("************************");
		 System.out.println("Sistema numeros aleatorios");
		 System.out.println("jogos mega sena");
		 System.out.println("************************");
		 
		 
		 System.out.println("quanto de aposta");
		 int quantodeaposta = new Integer(ler.nextLine());
		 
		 
		 System.out.println("Entre com a quantidade de numeros de cada aposta");

			int quantidadeNumeros = 0;

			while ((quantidadeNumeros < 6) || (quantidadeNumeros > 15)) {
				System.out.println("Obs: Mínimo de 6 e Máximo de 15");
				quantidadeNumeros = new Integer(ler.nextLine());
			}

			// Matriz para guardar as apostas
			int[][] listaJogos = new int[quantodeaposta][quantidadeNumeros];

			int x = 0;

			// Incluindo as apostas
			while (x < quantodeaposta) {

				int numeroAleatorio = 0;

				int y = 0;

				// Selecionando os numeros aleatorios

				while (y < quantidadeNumeros) {

					numeroAleatorio = (int) Math.round(Math.random() * 100);

					if (numeroAleatorio > 60) {// se maior que 60 escolhe outro
						continue;
					}

					// **********************************
					boolean numeroRepetido = false;

					for (int z = 0; z <= y; z++) {

						if ((listaJogos[x][z]) == numeroAleatorio) {
							// se repetido escolhe outro
							numeroRepetido = true;
							break;
						}
					}

					if (numeroRepetido) {// se repetido escolhe outro
						continue;
					} else {
						listaJogos[x][y] = numeroAleatorio;

						y++;

					}

				}

				x++;

			}

			// fim gerar apostas

			// Ordenando as apostas pelas colunas
			x = 0;
			while (x < (quantodeaposta)) {

				for (int i = 0; i < quantidadeNumeros - 1; i++) {

					int troca;
					// a=1 para buscar da 2ª posicao em diante
					for (int a = 1; a < (quantidadeNumeros - i); a++) {

						if (listaJogos[x][i] > listaJogos[x][i + a]) {
							troca = listaJogos[x][i];
							listaJogos[x][i] = listaJogos[x][i + a];
							listaJogos[x][i + a] = troca;
						}

					}

				}

				x++;

			}


			// Ordenando as apostas pelas linhas e 1ª coluna

			x = 0;
			int[] troca;
			while (x < (quantodeaposta - 1)) {

				for (int a = x + 1; a < quantodeaposta; a++) {

					if ((listaJogos[x][0]) > (listaJogos[(a)][0])) {
						troca = listaJogos[x];
						listaJogos[x] = listaJogos[a];
						listaJogos[a] = troca;
					}

				}

				x++;

			}

			// Listando as apostas

			System.out.println("***********************************");
			System.out.println();
			System.out.println("Apostas geradas:");
			for (int i = 0; i < listaJogos.length; i++) {

				for (int w = 0; w < (quantidadeNumeros); w++) {
					// System.out.print(listaJogos[i][x] + ", ");
					System.out.print((w < (quantidadeNumeros - 1) ? listaJogos[i][w] + " - " : listaJogos[i][w]));
				}
				System.out.println();
			}
			//


			System.out.println("***************Fim das apostas********************");

			ler.close();

		}

	
		 
}


