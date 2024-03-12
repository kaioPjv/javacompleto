
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class composiçao {
	
	
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
	ArrayList<String> linhas= new ArrayList<String>();


	for (int i = 0; i < 5; i++) {
		System.out.print("dia oq fazer " + i + ": ");
		String nome = ler.nextLine();

		linhas.add(nome);
	}

	Path arquivo = Paths.get("/tmp/aula/arquivo.txt");
	Files.write(arquivo, linhas);

	ler.close();
	System.out.println("Fim...");




	}

}
