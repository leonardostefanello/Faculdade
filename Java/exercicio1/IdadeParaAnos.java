package exercicio1;

import java.util.Scanner;

public class IdadeParaAnos {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informações
        System.out.println("Quantos dias você tem?");
        int dias = ler.nextInt();
        
        //Resultado
        int dm = dias/30;
        int da = dias/365;
        
        //INCOMPLETE, NEED TO FIX THAT FUCKING ERROR BRUH
        System.out.println("Dias: " + dias);
        System.out.println("Mêses: " + dm);
        System.out.println("Anos " + da);
        
	}

}
