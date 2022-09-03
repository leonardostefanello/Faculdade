package exercicio2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BonificaçãoSalário {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Váriaveis
        double salário;
        double vendas;
        double total;
        
        //Informações
        System.out.println("Digite o salário do vendedor: ");
        salário = ler.nextInt();
        
        System.out.println("Digite o valor do total de vendas neste mês: ");
        vendas = ler.nextInt();
        
        Locale brazil = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
        
        //Comparação
        if (vendas > 200000) {
        	//Comissão de 20%
        	total = salário + (0.2 * salário);
        	System.out.println("O vendedor deverá ganhar: " + nf.format(total) + " (20%)");
        } else if (vendas < 200000) {
        	//Comissão de 10%
        	total = salário + (0.2 * salário);
        	System.out.println("O vendedor deverá gnahar: " + nf.format(total) + " (10%)");
        	
        }
	}
}

