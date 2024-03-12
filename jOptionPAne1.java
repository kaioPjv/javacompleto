import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class jOptionPAne1 {

	public static void main(String[] args) throws Exception {
		
		//vo usa pa mostra o dialogo de informaçao
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		JOptionPane.showMessageDialog(null, " kaio ola ");
	}
}
