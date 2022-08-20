package exercicio1;

import java.util.Scanner;

public class LucroVendedor {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informação
        System.out.println("Digite o nome do vendedor:");
        String nome = ler.nextLine();
        
        System.out.println("Digita a quantidade de unidades vendidas no mês:");
        int quantidade = ler.nextInt();
        
        System.out.println("Preço unitário do produto:");
        double pp = ler.nextDouble();
 
        //Resultado
        double resultado = (pp * quantidade);
        System.out.println("Vendedor: " +nome);
        System.out.println("Valor Total: " +resultado);


	}

}
