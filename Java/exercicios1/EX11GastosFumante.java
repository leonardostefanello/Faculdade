package exercicio1;

import java.util.Scanner;

public class EX11GastosFumante {

	public static void main(String[] args) {

        //variável
        Scanner ler = new Scanner(System.in);
        int qa, qc;
        double pc, resultado;
        
        //informações (inputs)
        System.out.println("Quantos anos fumando?");
        qa = ler.nextInt();
        System.out.println("Quantidade de cigarros por dia:");
        qc = ler.nextInt();
        System.out.println("Preço do cigarro:");
        pc = ler.nextDouble();
        
        //calculos
        resultado = ((qa*365)*qc)*pc;

        //print
        System.out.println("Resultado: " + resultado);

        //fechar scanner
        ler.close();
	}

}
