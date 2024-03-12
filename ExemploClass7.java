
public class ExemploClass7 {
	
	public static void main(String[] args) {
		
		String s = "curso_java_web_pro";


		String[] array = s.split("_");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]=" + array[i]);
	}
	}
}
