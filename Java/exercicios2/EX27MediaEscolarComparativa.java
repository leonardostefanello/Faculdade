package exercicio2;

import java.util.Scanner;

public class EX27MediaEscolarComparativa {

	public static void main(String[] args) {

                //váriaveis
                Scanner ler = new Scanner(System.in);
                String nome;
                double me, ma, nota1, nota2, nota3;
                
                //informações (inputs)
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
                
                //calculos
                ma = (nota1 + nota2 * 2 + nota3 * 3 + me)/7;
                
                //comparações
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
                
                //fechar scanner
                ler.close();
        }
}