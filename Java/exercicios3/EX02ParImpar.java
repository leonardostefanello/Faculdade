package exercicio3;

import java.util.Scanner;

public class EX02ParImpar {
	
	public static void main(String[] args) {

        //declaração da variável
        Scanner scanner = new Scanner(System.in);
        int n1;
        
        //informações (input)
        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();
        
        //comparação
        if (n1 % 2 == 0) {
        	System.out.println("0"); //print 0 se o valor for par
        } else {
        	System.out.println("1"); //print 1 se o valor for impar
        }

        //number check
		System.out.println();

        //fechar scanner
        scanner.close();
	}
}

