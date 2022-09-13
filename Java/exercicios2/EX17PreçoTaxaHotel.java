package exercicio2;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class EX17PreçoTaxaHotel {
		//cria uma função conversão() que retorna um valor já formatado com a moeda BRL (R$)
		static String conversão(double valor) {
			//conversão para BRL
			Locale brazil = new Locale("pt", "BR");
			NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
			return nf.format(valor); //retorna o valor formatado
		}

    	public static void main(String[] args) throws Exception {
            System.out.println("---------------------------------------------");
            
            //declaração variáveis
            Double diaria = 100.0;
            Double tserviço = 0.0;
            
            //informações (inputs)
            Scanner ler = new Scanner(System.in);
            System.out.println("Nome do Hospede: ");
            String nome = ler.next();
            System.out.println("Numero de dias hospedado: ");
            int dias = ler.nextInt();
            
            //comparação
            if (dias < 10) {
            	tserviço = 8.0;
            } else if (dias >= 10 && dias >= 14) {
            	tserviço = 6.0;
            } else if (dias > 15) {
            	tserviço = 5.0;
            }

            //calculos
            Double resultado = diaria * dias + tserviço;

            //print
            System.out.println("---------------------------------------------");
            System.out.println("Nome: " + nome);
            System.out.println("Dias Hospedado: " + dias);
            System.out.println("Valor a ser pago: " + conversão(resultado));
            System.out.println("---------------------------------------------");

            //fechar scanner
            ler.close();
    }
}
