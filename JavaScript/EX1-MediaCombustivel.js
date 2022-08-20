package exercicio1;

import java.util.Scanner;

public class MediaCombustivel {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informação
        System.out.println("Digite a distancia percorrida:");
        double distancia = ler.nextInt();
        
        System.out.println("Digite o combustivel consumido:");
        double combustivel = ler.nextInt();
        
        double media = distancia/combustivel;
        System.out.println("A média do seu veiculo é de: " +media);


	}

}
