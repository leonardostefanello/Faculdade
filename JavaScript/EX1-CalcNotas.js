package exercicio1;

import java.util.Scanner;

public class CalcNota {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informação
        System.out.println("Digite o nome do aluno:");
        String nome = ler.nextLine();
        
        System.out.println("Digite a nota da P1:");
        double n1 = ler.nextDouble();
        
        System.out.println("Digite a nota da P2:");
        double n2 = ler.nextDouble();
        
        System.out.println("Digite a nota da P3:");
        double n3 = ler.nextDouble();
 
        //Resultado
        int media = (int) ((n1*1)+(n2*2)+(n3*3))/(1+2+3);
        System.out.println("Aluno: " +nome);
        System.out.println("Média: " +media);


	}

}
