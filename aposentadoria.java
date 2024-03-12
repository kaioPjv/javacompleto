import java.util.Scanner;

public class aposentadoria {

     public static void main(String[] args) {
    	
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("qual sua idade");
    	 double idade = sc.nextDouble();
    	 
    	System.out.println("tempo de contribuicao");
    	double tempodecontribuicao = sc.nextDouble();
    	
         int tempocontribuicao = 0;
		if(idade >= 55 && tempocontribuicao >= 25){
         System.out.println("ja pode aposentar!");
         } else {
         System.out.println("voce ainda nao pode aposentar!");
         }
         
         sc.close();
         
     }
     


}