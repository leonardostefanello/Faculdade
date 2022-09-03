package exercicio1;

import java.util.Scanner;

public class MediaCombustivel {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informação
        System.out.println("Digite a distancia percorrida:");
        Double distancia = ler.nextDouble();
        
        System.out.println("Digite o combustivel consumido:");
        Double combustivel = ler.nextDouble();
        
        double media = distancia/combustivel;
        System.out.println("A média do seu veiculo é de: " +media);


	}

}
