package exercicio1;

import java.util.Scanner;

public class EX04CalcTemperatura {

	public static void main(String[] args) {
        
        //variável
        Scanner ler = new Scanner(System.in);
        double fahrenheit, celcius;

        //informação (input)
        System.out.printf("Digite o valor em fahrenheit:");
        fahrenheit = ler.nextDouble();
        
        //conversão
        celcius = (int) (fahrenheit-32)*5/9;

        //print
        System.out.printf("Celcius = " + celcius);

        //fechar scanner
        ler.close();
	}

}
