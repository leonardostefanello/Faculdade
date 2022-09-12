package exercicio1;

import java.util.Scanner;

public class EX20InfoVendedor {

	public static void main(String[] args) {

        //variável
        Scanner ler = new Scanner(System.in);
        double tr, tpd, vp, cvv, cvp;
        
        //informações (inputs)
        System.out.println("Qual foi o total recebido?");
        tr = ler.nextDouble();
        
        //calculos
        tpd = tr*(10/100);
        vp = 0;
        cvv = 0;
        cvp = 0;
        
        //prints
        System.out.println("Total a pagar com desconto de 10% =" + tpd);
        System.out.println("Valor de cada parcela = " + vp);
        System.out.println("Comissão do vendedor a vista = " + cvv);
        System.out.println("Comissão do vendedor parcelado = " + cvp);

        //fechar scanner
        ler.close();
	}

}
