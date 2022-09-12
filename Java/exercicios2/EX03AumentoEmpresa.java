package exercicio2;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class EX03AumentoEmpresa {

	public static void main(String[] args) {
                
                //variável
                Scanner ler = new Scanner(System.in);
                double salario, aumento;
                
                //informações (inputs)
                System.out.println("Digite seu salário!");
                salario = ler.nextDouble();
                
                //calculos
                aumento = salario + (0.3*salario);
                
                //conversão para BRL
                Locale brazil = new Locale("pt", "BR");
                NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
                
                //comparação
                if (salario < 5000) {    	
                        System.out.println("Seu salário foi reajustado para: " + nf.format(aumento));
                } else {
                        System.out.println("Seu salário se manteve igual a: " + nf.format(salario));
                }
                
                //fechar scanner
                ler.close();
	}

}
