package view;

import controller.RecursividadeController;
import util.Util;

public class Principal {
	public static void main(String[] args) {
		
		RecursividadeController rc = new RecursividadeController();
		Util metodos = new Util();
		
		int[] vt = {4, -3, 7, -1, 0, -8, 5, -2, 9, -6};			// Hard-Coded apenas para testar
		int negativos = rc.contaNegativos(vt, vt.length);
		
		metodos.mostraTotal(negativos);
	}
}
