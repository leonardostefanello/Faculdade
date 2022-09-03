package exercicio2;

import java.util.Scanner;

public class MédiaAlunos {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Váriaveis
        String nome1;
        int media1;
        String nome2;
        int media2;
        
        //Informações
        System.out.println("Digite nome do primeiro aluno: ");
        nome1 = ler.nextLine();
        
        System.out.println("Digite a media do primeiro aluno: ");
        media1 = ler.nextInt();
        
        System.out.println("Digite nome do segundo aluno: ");
        nome2 = ler.nextLine();
        ler.nextLine();
        
        System.out.println("Digite a media do segundo aluno: ");
        media2 = ler.nextInt();
        
        //Comparação
        if (media1 > media2) {
        	System.out.println("Aluno: " + nome1);
        	System.out.println("Méda: " + media1);
        	System.out.println("Status: APROVADO");
        } else if (media2 > media1) {
        	System.out.println("Aluno: " + nome2);
        	System.out.println("Méda: " + media2);
        	System.out.println("Status: APROVADO");

	}
	}
}

