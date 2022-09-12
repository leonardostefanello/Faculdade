package exercicio1;

import java.util.Scanner;

public class EX03CalcAreaCirculo {

	public static void main(String[] args) {
        
        //variável
        Scanner ler = new Scanner(System.in);
        final double PI = 3.1415; // final == variável permanente
        double raio, area;
        
        //raio do circulo
        System.out.println("Digite o raio do circulo:");
        raio = ler.nextFloat();

        //calculos
        area = (PI*(raio*raio));

        //print
        System.out.println("Area do Circulo = " + area);

        //fechar scanner
        ler.close();
	}

}
