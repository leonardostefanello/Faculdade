package exercicio1;

import java.util.Scanner;

public class IdadeParaDias {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Informações
        System.out.println("Quantos anos você tem?");
        int ia = ler.nextInt();
        System.out.println("Quantos mêses você tem?");
        int im = ler.nextInt();
        System.out.println("Quantos dias você tem?");
        int id = ler.nextInt();
        
        //Resultado
        int am = (ia*12)+im;
        int md = (am*30)+id;
        
        //INCOMPLETE, NEED TO FIX THAT FUCKING ERROR BRUH
        System.out.println("Você tem " + md + " dias!");

	}

}
