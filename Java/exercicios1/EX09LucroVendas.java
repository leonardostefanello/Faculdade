package exercicio1;

import java.util.Scanner;

public class EX09LucroVendas {

	public static void main(String[] args) {
        
        //variável
        Scanner ler = new Scanner(System.in);
        String nome;
        double pc, pv;

        //informação (inputs)
        System.out.println("Digite o nome do produto:");
        nome = ler.nextLine();
        System.out.println("Preço de Compra:");
        pc = ler.nextDouble();
        System.out.println("Preço de Venda:");
        pv = ler.nextDouble();
 
        //calculos
        double lucro = (pv-pc);

        //print
        System.out.println("Produto: " +nome);
        System.out.println("Lucro: " +lucro);

        //fechar scanner
        ler.close();
	}

}
