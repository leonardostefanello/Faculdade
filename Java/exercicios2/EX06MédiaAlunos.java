package exercicio2;

import java.util.Scanner;

public class EX06MédiaAlunos {

	public static void main(String[] args) {

        //váriaveis
        Scanner ler = new Scanner(System.in);
        String nome1, nome2;
        int media1, media2;
        
        //informações (inputs)
        System.out.println("Digite nome do primeiro aluno: ");
        nome1 = ler.nextLine();
        System.out.println("Digite a media do primeiro aluno: ");
        media1 = ler.nextInt();  
        System.out.println("Digite nome do segundo aluno: ");
        nome2 = ler.nextLine();
        ler.nextLine();
        System.out.println("Digite a media do segundo aluno: ");
        media2 = ler.nextInt();
        
        //comparação
        if (media1 > media2) {
        	System.out.println("Aluno: " + nome1);
        	System.out.println("Méda: " + media1);
        	System.out.println("Status: APROVADO");
        } else if (media2 > media1) {
        	System.out.println("Aluno: " + nome2);
        	System.out.println("Méda: " + media2);
        	System.out.println("Status: APROVADO");

	}

        //fechar scanner
        ler.close();
	}
}

