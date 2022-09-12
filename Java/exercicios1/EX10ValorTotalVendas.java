package exercicio1;

import java.util.Scanner;

public class EX10ValorTotalVendas {

	public static void main(String[] args) {

        //variável
        Scanner ler = new Scanner(System.in);
        String nome;
        int quantidade;
        double pp, resultado;
        
        //informação (inputs)
        System.out.println("Digite o nome do vendedor:");
        nome = ler.nextLine();
        System.out.println("Digita a quantidade de unidades vendidas no mês:");
        quantidade = ler.nextInt();
        System.out.println("Preço unitário do produto:");
        pp = ler.nextDouble();
 
        //calculos
        resultado = (pp * quantidade);

        //print
        System.out.println("Vendedor: " +nome);
        System.out.println("Valor Total: " +resultado);

        //fechar scanner
        ler.close();
	}
}
