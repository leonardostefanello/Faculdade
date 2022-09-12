package exercicio2;

import java.util.Scanner;

public class EX05RepresentantesFabrica {

	public static void main(String[] args) {

                //váriaveis
                Scanner ler = new Scanner(System.in);
                int homens, mulheres;
                
                //informações (inputs)
                System.out.println("Digite a quantidade de homens!");
                homens = ler.nextInt();
                System.out.println("Digite a quantidade de mulheres!");
                mulheres = ler.nextInt();
                
                //comparação
                if (homens > mulheres) {
                        System.out.println("O número de homens é maior que o número de mulheres!");
                } else if (mulheres > homens) {
                        System.out.println("O número de mulheres é maior que o número de homens!");

                }

                //fechas scanner
                ler.close();
	}
}

