package exercicio2;

//Substitui o Scanner :)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class PreçoTaxaHotel {
    	public static void main(String[] args) throws Exception {
            System.out.println("------------------ INICIO ------------------");
            System.out.println("\n");
            
            //Variáveis
            String nome, dias;
            int d2, resultado;
            
            //Informações
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nome do Hospede: ");
            nome = br.readLine();
            System.out.println("Numero de dias hospedado: ");
            dias = br.readLine();
            System.out.println("\n");
            
            //Conversão de String para Inteiro
            d2 = Integer.parseInt(dias);

            //Conversão para BRL
            Locale brazil = new Locale("pt", "BR");
            NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
            
            if (d2 < 10) {
            	resultado = (100 * d2) + (8 * d2);
                System.out.println("---------------------------------------------");
            	System.out.println("Nome: " + nome);
            	System.out.println("Dias Hospedado: " + d2);
            	System.out.println("Valor a ser pago: " + nf.format(resultado));
            } else if (d2 > 10 && d2 < 15) {
            	resultado = (100 * d2) + (6 * d2);
                System.out.println("---------------------------------------------");
            	System.out.println("Nome: " + nome);
            	System.out.println("Dias Hospedado: " + d2);
            	System.out.println("Valor a ser pago: " + nf.format(resultado));
            } else if (d2 > 15) {
            	resultado = (100 * d2) + (5 * d2);
                System.out.println("---------------------------------------------");
            	System.out.println("Nome: " + nome);
            	System.out.println("Dias Hospedado: " + d2);
            	System.out.println("Valor a ser pago: " + nf.format(resultado));
            }
            System.out.println("---------------------------------------------");
    }
}
