package exercicio1;

import java.util.Scanner;

public class InfoNotas {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informação
        System.out.println("Digite o nome do aluno:");
        String nome = ler.nextLine();
        
        System.out.println("Digite a nota da P1:");
        Double n1 = ler.nextDouble();
        
        System.out.println("Digite a nota da P2:");
        Double n2 = ler.nextDouble();
        
        System.out.println("Digite a nota da P3:");
        Double n3 = ler.nextDouble();
        
        System.out.println("" +nome);
        System.out.println("" +n1);
        System.out.println("" +n2);
        System.out.println("" +n3);


	}

}
