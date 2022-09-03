package exercicio1;

import java.util.Scanner;

public class GastosFumante {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informações
        System.out.println("Quantos anos fumando?");
        int qa = ler.nextInt();

        System.out.println("Quantidade de cigarros por dia:");
        int qc = ler.nextInt();
        
        System.out.println("Preço do cigarro:");
        double pc = ler.nextDouble();
        
        double resultado = ((qa*365)*qc)*pc;
        System.out.println("Resultado: " + resultado);

	}

}
