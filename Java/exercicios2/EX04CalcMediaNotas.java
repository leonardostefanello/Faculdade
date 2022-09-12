package exercicio2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class EX04CalcMediaNotas {

        public static void main(String[] args) {

        //váriaveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner ler = new Scanner(System.in);
        String nome;
        double n1, n2, n3, média;
        
        //informações (inputs)
        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextDouble();
          
        //calculos
        média = (n1+n2+n3)/3;
        
        //comparação
        if (média > 7) {    	
        	System.out.println("o aluno " + nome + " foi aprovado com média " + df.format(média));
        } else
        	System.out.println("o aluno " + nome + " foi reprovado com média " + df.format(média));

        //fechar scanner
        ler.close();
	}
}

