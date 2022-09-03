package exercicio2;

import java.util.Scanner;

public class PositivoOuNegativo {

	// Função para ver se é positivo ou negativo
	static String checkPosNeg(int x)
	{

		// Ver se o valor é maior que 0 ou não
		if (x > 0)
			return "Positivo";

		else if (x < 0)
			return "Negativo";

		else
			return "zero";
	}
	
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1;
        
        //Informações
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        
        //Number Check
		System.out.println(n1 + " é um número " + checkPosNeg(n1));
	}
}

