package exercicio2;

import java.util.Scanner;

public class CategoriaDaSuaIdade {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Váriaveis
        int idade;
        
        //Informações
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        
        //Comparação
        if (idade < 12) {
        	//Criança
        	System.out.println("Você é uma CRIANÇA, vai jogar Fortnite!");
        } else if (idade > 12 && idade < 20) {
        	//Adolescente
        	System.out.println("Você é um ADOLESCENTE, bora pro bar caralho!!!");
        } else if (idade > 20) {
        	//Adulto
        	System.out.println("Você é um ADULTO, boa sorte pagando as contas!");
        }
	}
}

