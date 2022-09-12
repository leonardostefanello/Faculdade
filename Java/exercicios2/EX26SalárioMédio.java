package progresso;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class EX26SalárioMédio {

        //cria uma função conversão() que retorna um valor já formatado com a moeda BRL (R$)
        static String conversão(double valor) {
            //conversão para BRL
            Locale brazil = new Locale("pt", "BR");
            NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
            return nf.format(valor); //retorna o valor formatado
        }

    public static void main(String[] args) {
        
        System.out.println("---------------------------------------------");

        //variável
        Scanner ler = new Scanner(System.in);
        double sm, vc;

        //informações (input)
        System.out.println("Digite o salário médio: ");
        sm = ler.nextDouble();

        //comparação
        System.out.println("---------------------------------------------");
        if (sm <= 1000) {
            vc = sm;
            System.out.println("Salário Médio: " + conversão(sm));
            System.out.println("Valor do Crédito: " + conversão(vc));
        } else if (sm > 1000 && sm <= 2000) {
            vc = sm+(0.2*sm);
            System.out.println("Salário Médio: " + conversão(sm));
            System.out.println("Valor do Crédito: " + conversão(vc));
        } else if (sm > 2000 && sm <= 3000) {
            vc = sm+(0.3*sm);
            System.out.println("Salário Médio: " + conversão(sm));
            System.out.println("Valor do Crédito: " + conversão(vc));
        } else if (sm > 3000) {
            vc = sm+(0.4*sm);
            System.out.println("Salário Médio: " + conversão(sm));
            System.out.println("Valor do Crédito: " + conversão(vc));
        }
        System.out.println("---------------------------------------------");

        //fechar scanner
        ler.close();
    }
}