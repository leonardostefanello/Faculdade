package exercicio1;

import java.util.Scanner;

public class EX05TempoParaSegundos {

	public static void main(String[] args) {

        //variável
        Scanner ler = new Scanner(System.in);
        int horas, minutos, segundos, hs, ms, resultado;

        //informação (inputs)
        System.out.println("Digite as Horas:");
        horas = ler.nextInt();
        System.out.println("Digite os Minutos:");
        minutos = ler.nextInt();
        System.out.println("Digite os Segundos:");
        segundos = ler.nextInt();
        
        //calculos
        hs = horas*3600;
        ms = minutos*60;
        resultado = hs+ms+segundos;

        //print
        System.out.println("Resultado = " +resultado);

        //fechar scanner
        ler.close();
	}

}
