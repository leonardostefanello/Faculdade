package exercicio1;

import java.util.Scanner;

public class EX06MediaCombustivel {

	public static void main(String[] args) {

        //variável
        Scanner ler = new Scanner(System.in);
        double distancia, combustivel, media;
        
        //informação (inputs)
        System.out.println("Digite a distancia percorrida:");
        distancia = ler.nextDouble();
        System.out.println("Digite o combustivel consumido:");
        combustivel = ler.nextDouble();
        
        //calculos
        media = distancia/combustivel;

        //print
        System.out.println("A média do seu veiculo é de: " +media);

        //fechar scanner
        ler.close();
	}

}
