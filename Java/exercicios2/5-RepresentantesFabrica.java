package exercicio2;

import java.util.Scanner;

public class RepresentantesFabrica {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Váriaveis
        int homens;
        int mulheres;
        int resto;
        
        //Informações
        System.out.println("Digite a quantidade de homens!");
        homens = ler.nextInt();
        
        System.out.println("Digite a quantidade de mulheres!");
        mulheres = ler.nextInt();
        
        //Comparação
        if (homens > mulheres) {
        	System.out.println("O número de homens é maior que o número de mulheres!");
        } else if (mulheres > homens) {
        	System.out.println("O número de mulheres é maior que o número de homens!");

	}
	}
}

