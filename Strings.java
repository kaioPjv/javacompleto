
public class Strings {
	public static void main(String[] args) {
		//String  
		String s = "ola";  // ola foi criada a string
		s = s + " pessoal "; // pessoal foi criada a String
		
		System.out.println(s);
		
		 // este geito acima nao e legal logo abaixo esta o geito top
		
		
		StringBuilder sb = new StringBuilder("ola");//existe a Stringbuilder a gente ta reaproveitando a String buidder nois estamos contqtenano
		
		sb.append(" pessoal ");
		
		
		String resultado = sb.toString();
		
		System.out.println("com StringBuilder :" + resultado);
	}

}
