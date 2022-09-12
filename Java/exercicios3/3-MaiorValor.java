package exercicio3;

import java.util.Scanner;

public class MaioValor03 {
	
	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
                int n1, n2;
                
                //Informações
                System.out.println("Digite um número1: ");
                n1 = ler.nextInt();
                
                System.out.println("Digite um número2: ");
                n2= ler.nextInt();
                
                
                if (n1 > n2) {
                	System.out.println(n1 + " maior que " + n2);
                } else {
                	System.out.println(n2 + " maior que " + n1);
                }
        }
	}
}

