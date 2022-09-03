package exercicio2;

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1;
        
        //Informações
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        
        if (n1 % 2 == 0) {
        	System.out.println("O número é par!");
        } else {
        	System.out.println("O número é impar!");
        }
        
        //Number Check
		System.out.println();
	}
}

