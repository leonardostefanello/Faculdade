package exercicio1;

import java.util.Scanner;

public class CalculoTemperatura {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Raio do Circulo
        System.out.println("Digite o valor em fahrenheit:");
        float fahrenheit = ler.nextFloat();
        
        float celcius = (fahrenheit-32)*5/9;
        System.out.println("Celcius = "+celcius);

	}

}
