package exercicio2;

import java.util.Scanner;

public class MediaEscolarComparativa {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Váriaveis
        String nome;
        double me, ma, nota1, nota2, nota3;
        
        //Informações
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextDouble();
        
        System.out.println("Média de aproveitamento: ");
        me = ler.nextDouble();
        
        //Calculos
        ma = (nota1 + nota2 * 2 + nota3 * 3 + me)/7;
        
        //Comparação
        if (ma > 9 || ma == 10) {
        	System.out.println("Nome: " + nome);
        	System.out.println("Média: " + ma);
        	System.out.println("Conceito: A");
        	System.out.println("APROVADO");	
        } else if (ma > 7.5 || ma < 9) {
        	System.out.println("Nome: " + nome);
        	System.out.println("Média: " + ma);
        	System.out.println("Conceito: B");
        	System.out.println("APROVADO");	
        } else if (ma > 6 || ma < 7.5) {
        	System.out.println("Nome: " + nome);
        	System.out.println("Média: " + ma);
        	System.out.println("Conceito: C");
        	System.out.println("APROVADO");	
        } else if (ma > 4 || ma < 6) {
        	System.out.println("Nome: " + nome);
        	System.out.println("Média: " + ma);
        	System.out.println("Conceito: D");
        	System.out.println("APROVADO");	
        } else if (ma < 4) {
        	System.out.println("Nome: " + nome);
        	System.out.println("Média: " + ma);
        	System.out.println("Conceito: E");
        	System.out.println("APROVADO");	
        }
	}
}
