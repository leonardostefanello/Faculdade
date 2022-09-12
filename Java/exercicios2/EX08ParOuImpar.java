package exercicio2;

import java.util.Scanner;

public class EX08ParOuImpar {
	
	public static void main(String[] args) {

        //variável
        Scanner ler = new Scanner(System.in);
        int n1;
        
        //informações (inputs)
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        
        //comparações
        if (n1 % 2 == 0) {
        	System.out.println("O número é par!");
        } else {
        	System.out.println("O número é impar!");
        }
        
        //number check
		System.out.println();

        //fechar scanner
        ler.close();
	}
}

