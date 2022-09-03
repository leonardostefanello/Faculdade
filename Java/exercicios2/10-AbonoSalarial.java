package exercicio2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AbonoSalárial {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Váriaveis
        double salário;
        double dependentes;
        double total;
        
        //Informações
        System.out.println("Digite o salário do vendedor: ");
        salário = ler.nextInt();
        
        System.out.println("Digite o número de dependentes: ");
        dependentes = ler.nextInt();
        
        Locale brazil = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
        
        //Comparação
        if (dependentes > 2) {
        	//Abono de R$100.00
        	total = salário + 100;
        	System.out.println("O vendedor deverá ganhar: " + nf.format(total) + " (Com Abono)");
        } else if (dependentes < 2) {
        	//Sem Abono
        	System.out.println("O vendedor deverá gnahar: " + nf.format(salário) + " (Sem Abono)");
        	
        }
	}
}

