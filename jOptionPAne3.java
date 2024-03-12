import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class jOptionPAne3 {

	public static void main(String[] args)throws  Exception{
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Object[] opcoes = {"Sim", "Não", "Sim, com e-mail"};
		
		
		JOptionPane.showOptionDialog(null, "voce gostaria de "
	     + "terminar o cadastro", "confirmaçao", 
		JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
		opcoes, opcoes[2]);
	
		
		
		System.out.println("opçao selecionada " + opcoes);

		
		int opcao = 0;
		if (opcao == 1) {
			
		
		
	}
	}
}
