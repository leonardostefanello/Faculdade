package exercicio1;

import java.util.Scanner;

public class EX07InfoNotas {

	public static void main(String[] args) {
        
        //variável
        Scanner ler = new Scanner(System.in);
        String nome;
        double n1, n2, n3, média;

        //informações (input)
        System.out.println("Digite o nome do aluno:");
        nome = ler.nextLine();
        System.out.println("Digite a nota da P1:");
        n1 = ler.nextDouble();
        System.out.println("Digite a nota da P2:");
        n2 = ler.nextDouble();
        System.out.println("Digite a nota da P3:");
        n3 = ler.nextDouble();
        
        //cálculo da média
        média = (n1+n2+n3)/3; 

        //print
        System.out.println("Nome do Aluno: " +nome);
        System.out.println("Média: " + média);

        //fechar scanner
        ler.close();
	}
}
