import jogador.Jogador;

public class TesteHerança {
	
	public static void main(String[] args) {
		Jogador j = new Jogador();
		
		j.nome = " ronaldo";
		j.idade = 37;
		
		j.seApresentar();
		
		Pessoa p = new Pessoa();
		p.dizerSeAindajoga();
		
	}

}
