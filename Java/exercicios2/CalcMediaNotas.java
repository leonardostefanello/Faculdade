package exercicio2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcMediaNotas {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
        Scanner ler = new Scanner(System.in);
        
        //Váriaveis
        double n1;
        double n2;
        double n3;
        double média;
        String nome;
        
        //Informações
        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextDouble();
          
        //Calculos
        média = (n1+n2+n3)/3;
    	
        //Comparação
        if (média > 7) {    	
        	System.out.println("o aluno " + nome + " foi aprovado com média " + df.format(média));
        } else
        	System.out.println("o aluno " + nome + " foi reprovado com média " + df.format(média));
	}

}

