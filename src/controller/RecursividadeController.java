package controller;

public class RecursividadeController {
	public int contaNegativos(int[] vt, int tamanho) {
		
		/*
		 * Caso base, se o TAMANHO do vetor for 0
		 * ele retorna 0, pois nao tem como ter um valor
		 * negativo sendo que não existem mais posiçoes dentro do vetor
		 */
		if (tamanho == 0) {
			return 0;
		}
		
		
		if (vt[tamanho - 1] < 0) {
			return 1 + contaNegativos(vt, tamanho - 1);		// Se o valor for negativo, soma 1 e continua a recursão
		}													// Retirnado 1 do tamanho para verificar o elemento anterior do array
		else {
			return contaNegativos(vt, tamanho - 1);			// Se for positivo, apenas "retira" 1 do tamanho para que possa
		}													// Verificar o elemento anterior do array
	}
}