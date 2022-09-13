package exercicio2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX19OrdemCrescente {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------");

		//scanner
		Scanner ler = new Scanner(System.in);

		//arraylist
		List<Double> numlist = new ArrayList<>();

		//loop para gerar as perguntas e ao mesmo tempo adicionar a resposta dentro da arraylist
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o " + i + " número: ");
			Double valor = ler.nextDouble();

			// adiciona o valor na arraylist
			numlist.add(valor);
		}

		//Collections.Sort --> organiza o array em ordem crescente
		Collections.sort(numlist);

		System.out.println("---------------------------------------------");
		//print
		System.out.println(numlist);

		//fechar scanner
		ler.close();
	}

}