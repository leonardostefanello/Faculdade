package exercicio1;

import java.util.Scanner;

public class EX18IdadeParaDias {

	public static void main(String[] args) {

        //variáveis
        Scanner ler = new Scanner(System.in);
        int ia, im, id, am, md;
        
        //informações (inputs)
        System.out.println("Quantos anos você tem?");
        ia = ler.nextInt();
        System.out.println("Quantos mêses você tem?");
        im = ler.nextInt();
        System.out.println("Quantos dias você tem?");
        id = ler.nextInt();
        
        //calculos
        am = (ia*12)+im;
        md = (am*30)+id;
        
        //print
        System.out.println("Você tem " + md + " dias!");

        //fechar scanner
        ler.close();
	}

}
