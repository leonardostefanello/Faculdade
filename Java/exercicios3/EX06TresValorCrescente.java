package exercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class EX06TresValorCrescente {

	public static void main(String[] args) {
		//print para decoração
        System.out.println("------------------ INICIO ------------------");
        System.out.println("\n");
        
		Scanner scanner = new Scanner(System.in);
			int [] numlist = new int[4]; //array com 4 posições
			
			//completa o array apartir da primeira posição
			for (int i = 1; i < numlist.length; i++) {
				System.out.print("Digite o " + i + " numero: ");
				numlist[i] = (scanner.nextInt());
			}
			System.out.println("\n");
			
			Arrays.sort(numlist); //coloca o array em ordem crescente
			
			//lista o array em ordem crescente
			System.out.print("Ordem Crescente: ");
			for (int j = 1; j < numlist.length; j++) {
				System.out.print(numlist[j] + "  ");
			}
		//print para decoração
		System.out.println("\n");
        System.out.println("---------------------------------------------");

		scanner.close();
	}
}