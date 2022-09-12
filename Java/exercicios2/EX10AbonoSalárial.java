package exercicio2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class EX10AbonoSalárial {

        public static void main(String[] args) {
                //váriaveis
                Scanner ler = new Scanner(System.in);
                double salário, dependentes, total;
                
                //informações (inputs)
                System.out.println("Digite o salário do vendedor: ");
                salário = ler.nextInt();
                System.out.println("Digite o número de dependentes: ");
                dependentes = ler.nextInt();
                
                //conversão para BRL
                Locale brazil = new Locale("pt", "BR");
                NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
                
                //comparação
                if (dependentes > 2) {
                        total = salário + 100; //abono de R$100.00
                        System.out.println("O vendedor deverá ganhar: " + nf.format(total) + " (Com Abono)");
                } else if (dependentes < 2) {
                        //sem Abono
                        System.out.println("O vendedor deverá gnahar: " + nf.format(salário) + " (Sem Abono)");
                        
                }

                //fechar scanner
                ler.close();
        }
}

