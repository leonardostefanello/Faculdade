package exercicio1;

import java.util.Scanner;

public class EX17CustoCarro {

	public static void main(String[] args) {
        
        //variável
        Scanner ler = new Scanner(System.in);
        double cf, pd, imp, resultado;
        
        //informações (inputs)
        System.out.println("Custo de fabrica de um carro:");
        cf = ler.nextDouble();
     
        //calculos
        pd = cf*(28/100);
        imp = cf*(45/100);
        resultado = (cf+pd+imp);
        		
        //print
        System.out.println("Valor de Fabrica: " + cf);
        System.out.println("Valor para o Consumidor: " + resultado);
        System.out.println("% Distribuidor: " + pd);
        System.out.println("% Impostos: " + imp);

        //fechar scanner
        ler.close();
	}

}

//NEED TO FINISH THIS BITCH