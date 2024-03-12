packge short;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandopeloNome {
	

	public static <T> void main(String[] args) {
		Pessoa p1 = new Pessoaa("João", 22);
		Pessoa p2 = new Pessoaa("Adriana", 23);
		Pessoa p3 = new Pessoaa("Bruno", 21);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		Collections.sort((List<T>) pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
