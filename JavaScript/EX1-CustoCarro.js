package exercicio1;

import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informações
        System.out.println("Custo de fabrica de um carro:");
        double cf = ler.nextDouble();
     
        double pd = cf*(28/100);
        double imp = cf*(45/100);
        
        //Resultado
        double resultado = (cf+pd+imp);
        		
        //INCOMPLETE, NEED TO FIX THAT FUCKING ERROR BRUH
        System.out.println("Valor de Fabrica: " + cf);
        System.out.println("Valor para o Consumidor: " + resultado);
        System.out.println("% Distribuidor: " + pd);
        System.out.println("% Impostos: " + imp);

	}

}
