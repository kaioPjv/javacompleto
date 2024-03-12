
public class exemploClasseString {
	
	public static void main(String[] args) {
		
		String nome = "kaio";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		nome = nome.toUpperCase();
		System.out.println(nome);
		
		//--------------------------------
	  String s1 = "kaio";
	  String s2 = "kaio";
	  
	  System.out.println("s1 == s2?" + (s1 = s2));
	  
	  String s3 = new String("kaio");
	  System.out.println("s3 == s1?" + (s3 == s1));
	  
	  System.out.println("s1.equals(s2) " + (s1.equals(s2)));
	  System.out.println("s3.equals(s1) " + (s3.equals(s1)));
	  
	  String s4 = "KaIo";
	  
	  System.out.println("s1.equals(s4) " + (s1.equals(s4)));
		
	}
}
