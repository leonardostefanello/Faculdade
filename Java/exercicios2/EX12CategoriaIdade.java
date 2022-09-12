package exercicio2;

import java.util.Scanner;

public class EX12CategoriaIdade {

	public static void main(String[] args) {

                //váriaveis
                Scanner ler = new Scanner(System.in);
                int idade;
                
                //informações (inputs)
                System.out.println("Digite a sua idade: ");
                idade = ler.nextInt();
                
                //comparação
                if (idade < 12) {
                        //criança
                        System.out.println("Você é uma CRIANÇA, vai jogar Fortnite!");
                } else if (idade > 12 && idade < 20) {
                        //adolescente
                        System.out.println("Você é um ADOLESCENTE, bora pro bar caralho!!!");
                } else if (idade > 20) {
                        //adulto
                        System.out.println("Você é um ADULTO, boa sorte pagando as contas!");
                }

                //fechar scanner
                ler.close();
	}
}

