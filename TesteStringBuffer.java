

public class TesteStringBuffer {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer(); // thread-safe
		//- use no contexto de concorrência
		
		
		StringBuffer sb = new StringBuffer();//não-thread-safe - mais rápido
		
		
       sb.append("ola");
		sb.append(" foque no seu curso ");
		sb.append(" ate logo ");
       
       System.out.println(sb.toString());
	
       sb.insert(28, " ");
       
       System.out.println(sb);
	}
}
