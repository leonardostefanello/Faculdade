package exercicio2;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        
        //Informações
        System.out.println("Digite o primeiro numero!");
        n1 = ler.nextInt();
        
        System.out.println("Digite o segundo numero!");
        n2 = ler.nextInt();

        if (n1 > n2) {
        	System.out.println("O número " + n1 + " é maior que " + n2);
        } else
        	System.out.println("O número " + n2 + " é maior que " + n1);

	}

}

