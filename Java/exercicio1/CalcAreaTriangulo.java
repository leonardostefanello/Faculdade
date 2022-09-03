package exercicio1;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Area do Triangulo
        System.out.println("Digite a base do triangulo:");
        float base = ler.nextFloat();
        
        System.out.println("Digite a altura do triangulo:");
        float altura = ler.nextFloat();
        
        float area = (base*altura)/3;
        System.out.println("Area do Triangulo = "+area);
	}

}
