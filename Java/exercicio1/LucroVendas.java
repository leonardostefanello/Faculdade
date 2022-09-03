package exercicio1;

import java.util.Scanner;

public class LucroVendas {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informação
        System.out.println("Digite o nome do produto:");
        String nome = ler.nextLine();
        
        System.out.println("Preço de Compra:");
        double pc = ler.nextDouble();
        
        System.out.println("Preço de Venda:");
        double pv = ler.nextDouble();
 
        //Resultado
        double lucro = (pv-pc);
        System.out.println("Produto: " +nome);
        System.out.println("Lucro: " +lucro);


	}

}
