package exercicio2;

import java.util.Scanner;

public class EX11MenorNúmero {

	public static void main(String[] args) {

                //váriaveis
                Scanner ler = new Scanner(System.in);
                int n1, n2, n3;
                
                //informações
                System.out.println("Digite o primeiro número: ");
                n1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                n2 = ler.nextInt();
                System.out.println("Digite o terceiro núemro: ");
                n3 = ler.nextInt();
                
                //comparação
                if (n1 < n2 || n1 < n3) {
                        //n1 menor
                        System.out.println("O número " + n1 + " é o menor que " + n2 + " e " + n3);
                } else if (n2 < n1 || n2 < n3) {
                        //n2 menor
                        System.out.println("O número " + n2 + " é o menor que " + n1 + " e " + n3);
                } else if (n3 < n1 || n3 < n2) {
                        //n3 menor
                        System.out.println("O número " + n3 + " é o menor que " + n1 + " e " + n2);
                }

                //fechar scanner
                ler.close();
	}
}

