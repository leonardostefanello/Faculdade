package exercicio1;

import java.util.Scanner;

public class IdadeParaDias {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informações
        System.out.println("Qual foi o total recebido?");
        double tr = ler.nextDouble();
        
        //Calculos
        double tpd = tr*(10/100);
        double vp = 0;
        double cvv = 0;
        double cvp = 0;
        
        //INCOMPLETE, NEED TO FIX THAT FUCKING ERROR BRUH
        System.out.println("Total a pagar com desconto de 10% =" + tpd);
        System.out.println("Valor de cada parcela = " + vp);
        System.out.println("Comissão do vendedor a vista = " + cvv);
        System.out.println("Comissão do vendedor parcelado = " + cvp);

        
	}

}
