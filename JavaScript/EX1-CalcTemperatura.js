package exercicio1;

import java.util.Scanner;

public class CalculoTemperatura {

	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Raio do Circulo
        System.out.println("Digite o valor em fahrenheit:");
        double fahrenheit = ler.nextDouble();
        
        double celcius = (fahrenheit-32)*5/9;
        System.out.println("Celcius = " + df.format(celcius));

	}

}
