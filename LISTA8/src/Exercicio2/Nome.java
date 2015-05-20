package Exercicio2;

import javax.swing.JOptionPane;

public class Nome {
		public static void main(String[] args) {
		String vetor[] = new String[5];
		int i;
				
		for (i = 0; i < vetor.length; i++){
			vetor[i]= JOptionPane.showInputDialog("Informe o nome");
		}
			String temp;
			boolean troca = true;
			while (troca == true){
				troca = false;
				for (i = 0; i < vetor.length - 1 ; i++){
					if (vetor[i].compareTo(vetor[i+1])>0){
						temp = vetor[i];
						vetor[i] = vetor[i+1];
						vetor[i+1] = temp;
						troca = true;
					}
				}
			}
			String impressao = "";
			for (i = 0; i < vetor.length; i++){
				impressao += vetor[i] + " - ";
			}
			JOptionPane.showMessageDialog(null, "Nomes Organizados - " + impressao);
			
			
		}
	}
