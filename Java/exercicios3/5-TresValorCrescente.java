package exercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class TresValorCrescente05 {

	public static void main(String[] args) {
        System.out.println("------------------ INICIO ------------------");
        System.out.println("\n");
        
		try (Scanner num = new Scanner(System.in)) {
			//Array com 5 posições
			int [] numlist = new int[4];
			
			//Completa o array apartir da primeira posição
			for (int i = 1; i < numlist.length; i++) {
				System.out.print("Digite o " + i + " numero: ");
				numlist[i] = (num.nextInt());
			}
			System.out.println("\n");
			
			//Coloca o array em ordem crescente
			Arrays.sort(numlist);
			
			//Lista os arrays em ordem crescente
			System.out.print("Ordem Crescente: ");
			for (int j = 1; j < numlist.length; j++) {
				System.out.print(numlist[j] + "  ");
			}
		}
		
		System.out.println("\n");
        System.out.println("---------------------------------------------");
	}

}