package exercicio2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class EX09BonificaçãoSalário {

    public static void main(String[] args) {

        //váriaveis
        Scanner ler = new Scanner(System.in);
        double salário, vendas, total;
        
        //informações (inputs)
        System.out.println("Digite o salário do vendedor: ");
        salário = ler.nextInt();
        System.out.println("Digite o valor do total de vendas neste mês: ");
        vendas = ler.nextInt();
        
        //conversão para BRL
        Locale brazil = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
        
        //comparação
        if (vendas > 200000) {
        	total = salário + (0.2 * salário); //comissão de 20%
        	System.out.println("O vendedor deverá ganhar: " + nf.format(total) + " (20%)");
        } else if (vendas < 200000) {
        	total = salário + (0.1 * salário); //comissão de 10%
        	System.out.println("O vendedor deverá gnahar: " + nf.format(total) + " (10%)");
        }

        //fechar scanner
        ler.close();
	}
}

