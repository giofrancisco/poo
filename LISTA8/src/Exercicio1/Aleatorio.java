package Exercicio1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Aleatorio {
		public static void main(String[] args) {
		int vetor[] = new int[500000];
		
		int i;
		
		Random valor = new Random();
		
		for (i = 0; i < vetor.length; i++){
			vetor[i]= valor.nextInt(50000);
		}
		
			int temp;
			long tempo1 = System.currentTimeMillis();
			boolean troca = true;
			while (troca == true){
				troca = false;
				for (i = 0; i < vetor.length - 1 ; i++){
					if (vetor[i] > vetor[i+1]){
						temp = vetor[i];
						vetor[i] = vetor[i+1];
						vetor[i+1] = temp;
						troca = true;
					}
				}
			}
			long tempo2 = System.currentTimeMillis();
			long tempototal = (tempo2 - tempo1) / 1000;
			JOptionPane.showMessageDialog(null, "Tempo da Busca " + tempototal);
			
			
		}
	}
