package exercicio1;

import java.util.Scanner;

public class EX08CalcNotas {

	public static void main(String[] args) {

        //variável
        Scanner ler = new Scanner(System.in);
        String nome;
        double n1, n2, n3, media;
        
        //informação (inputs)
        System.out.println("Digite o nome do aluno:");
        nome = ler.nextLine();
        System.out.println("Digite a nota da P1:");
        n1 = ler.nextDouble();
        System.out.println("Digite a nota da P2:");
        n2 = ler.nextDouble();
        System.out.println("Digite a nota da P3:");
        n3 = ler.nextDouble();
 
        //calculos
        media = (int) ((n1*1)+(n2*2)+(n3*3))/(1+2+3);

        //print
        System.out.println("Aluno: " +nome);
        System.out.println("Média: " +media);

        //fechar scanner
        ler.close();
	}

}
