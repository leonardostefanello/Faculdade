package exercicio3;

import java.util.Scanner;

public class ParImpar02 {
	
	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int n1;
            
            //Informações
            System.out.println("Digite um número: ");
            n1 = ler.nextInt();
            
            if (n1 % 2 == 0) {
            	System.out.println("0"); //print 0 se o valor for par
            } else {
            	System.out.println("1"); //print 1 se o valor for impar
            }
        }
        //Number Check
		System.out.println();
	}
}

