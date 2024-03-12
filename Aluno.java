
public class Aluno {

	String nome;

	public Aluno(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
			ListaAlunos lista = new ListaAlunos();
			
			Aluno aluno1 = new Aluno("kaio");
			aluno1.nome = "tiago";
			lista.adicionar(aluno1);
			
			Aluno aluno2 = new Aluno("joao");
			aluno2.nome = "Maria";
			lista.adicionar(aluno2);
			
			Aluno aluno3 = new Aluno("maria");
			aluno3.nome = "Alexandre";
			lista.adicionar(aluno3);
			
			Aluno aluno4= new Aluno("jose");
			aluno4.nome = "Normandes";
			lista.adicionar(aluno4);
			
			Aluno aluno5 = new Aluno("pedro");
			aluno5.nome = "joao";
			lista.adicionar(aluno5);
			
			for (int i = 0; i < lista.tamanho(); i++) {
				Aluno a = lista.obter(i);
				if (a != null) {
					System.out.println("Aluno: " + a.nome);
				} else {
					System.out.println("Aluno sem nome");
				}
		
			}
		}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	}