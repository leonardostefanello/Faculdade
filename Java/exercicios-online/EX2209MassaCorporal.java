package AulaOnline;

import java.util.Scanner;

public class EX2209 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        
        //variável
        Scanner ler = new Scanner(System.in);
        Double mc;

        //leitura
        System.out.println("Digite a sua Massa Corporal: ");
        mc = ler.nextDouble();

        System.out.println("---------------------------------------------");

        //comparação
        if (mc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (mc >= 17 && mc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (mc >= 18.5 && mc <= 24.99) {
            System.out.println("Peso Normal");
        } else if (mc >= 25 && mc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (mc >= 30 && mc <= 34.99) {
            System.out.println("Obesidade 1");
        } else if (mc >= 35 && mc <= 39.99) {
            System.out.println("Obesidade II (Severa)");
        }

        //fechar scanner
        ler.close();

        System.out.println("---------------------------------------------");
    }
}

//O ---------- é apenas para decoração! ;)
