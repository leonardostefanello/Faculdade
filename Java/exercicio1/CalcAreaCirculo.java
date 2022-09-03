package exercicio1;

import java.util.Scanner;

public class AeraCirculo {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pi = 3.1415;
        
        //Raio do Circulo
        System.out.println("Digite o raio do circulo:");
        float raio = ler.nextFloat();

        double area = (pi*(raio*raio));
        System.out.println("Area do Circulo = "+area);

	}

}
