package util;

import javax.swing.JOptionPane;


// Classe utilizada para não poluir a main
public class Util {
	public void mostraTotal(int num) {
		JOptionPane.showMessageDialog(null,
				"O total de números negativos contidos no vetor foi de: " +num);
	}
}
