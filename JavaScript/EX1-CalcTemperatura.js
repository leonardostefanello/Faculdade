package exercicio1;

import java.util.Scanner;

public class CalculoTemperatura {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Conversão
        System.out.printf("Digite o valor em fahrenheit:");
        double fahrenheit = ler.nextDouble();
        
        double celcius = (int) (fahrenheit-32)*5/9;
        System.out.printf("Celcius = " + celcius);

	}

}
