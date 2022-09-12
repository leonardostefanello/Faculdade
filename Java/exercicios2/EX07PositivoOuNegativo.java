package exercicio2;

import java.util.Scanner;

public class EX07PositivoOuNegativo {

	//função para ver se é positivo ou negativo
	static String checkPosNeg(int x)
	{

		//ver se o valor é maior que 0 ou não
		if (x > 0)
			return "Positivo";

		else if (x < 0)
			return "Negativo";

		else
			return "zero";
	}
	
	public static void main(String[] args) {

		//variável
        Scanner ler = new Scanner(System.in);
        int n1;
        
        //informações (inputs)
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        
        //number check
		System.out.println(n1 + " é um número " + checkPosNeg(n1));

		//fechar scanner
		ler.close();
	}
}

