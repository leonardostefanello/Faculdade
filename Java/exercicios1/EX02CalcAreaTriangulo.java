package exercicio1;

import java.util.Scanner;

public class EX02CalcAreaTriangulo {

	public static void main(String[] args) {

        //variáveis
        Scanner ler = new Scanner(System.in);
        double base, altura, area;

        //área do Triangulo
        System.out.println("Digite a base do triangulo: ");
        base = ler.nextDouble();
        System.out.println("Digite a altura do triangulo: ");
        altura = ler.nextDouble();

        //calculos
        area = (base*altura)/3;

        //print
        System.out.println("Área do Triangulo: " + area);

        //fechar scanner
        ler.close();
	}

}
