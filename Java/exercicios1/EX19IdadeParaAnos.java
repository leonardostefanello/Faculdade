package exercicio1;

import java.util.Scanner;

public class EX19IdadeParaAnos {

	public static void main(String[] args) {
        
        //variáveis
        Scanner ler = new Scanner(System.in);
        int dias, dm, da;

        //informações (inputs)
        System.out.println("Quantos dias você tem?");
        dias = ler.nextInt();
        
        //calculos
        dm = dias/30;
        da = dias/365;
        
        //print
        System.out.println("Dias: " + dias);
        System.out.println("Mêses: " + dm);
        System.out.println("Anos " + da);
        
        //fechar scanner
        ler.close();
	}
}
