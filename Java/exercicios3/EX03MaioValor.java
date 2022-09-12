package exercicio3;

import java.util.Scanner;

public class EX03MaioValor {
	
	public static void main(String[] args) {

        //declaração da variável
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        
        //informações (inputs)
        System.out.println("Digite um número1: ");
        n1 = scanner.nextInt();
        
        System.out.println("Digite um número2: ");
        n2= scanner.nextInt();
        
        //comparações
        if (n1 > n2) {
        	System.out.println(n1 + " maior que " + n2);
        } else {
        	System.out.println(n2 + " maior que " + n1);
        }

        //fechar scanner
        scanner.close();
	}
}

