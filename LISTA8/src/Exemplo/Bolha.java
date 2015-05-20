package Exemplo;

import javax.swing.JOptionPane;

public class Bolha {
	public static void main(String[] args) {
		int vetor[] = new int[5];
		int i;

		for(i = 0; i < 5; i++)
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
		int temp;
		boolean troca = true;
		while (troca == true){
			troca = false;
			for (i = 0; i < 4; i++){
				if (vetor[i] > vetor[i+1]){
					temp = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = temp;
					troca = true;
				}
			}
		}
		String impressao = "";
		for (i = 0; i < 5; i++){
			impressao += vetor[i] + " - ";
		}
		JOptionPane.showMessageDialog(null, "Vetor Organizado - " + impressao);
	}
}