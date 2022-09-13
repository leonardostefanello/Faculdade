package exercicio2;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class EX21Tinder {
		//cria uma função conversão() que retorna um valor já formatado com a moeda BRL (R$)
		static String conversão(double valor) {
			//conversão para BRL
			Locale brazil = new Locale("pt", "BR");
			NumberFormat nf = NumberFormat.getCurrencyInstance(brazil);
			return nf.format(valor); //retorna o valor formatado
		}
        
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------------------------");

        //variável
        Scanner ler = new Scanner(System.in);
        String nome, sexo;
        int idade;
        Double total = 0.0;

        //leitura
        System.out.println("Digite seu nome: ");
        nome = ler.next();
        System.out.println("Digite o sexo desejado: ");
        sexo = ler.next();
        System.out.println("Digite a idade desejada");
        idade = ler.nextInt();

        //comparação
        if (sexo.equalsIgnoreCase("M") && idade >= 18 && idade <= 21) {
            total = 300.0;
        } else if (sexo.equalsIgnoreCase("M") && idade >= 22 && idade <= 25) {
            total = 700.0;
        } else if (sexo.equalsIgnoreCase("M") && idade >= 26 && idade <= 30) {
            total = 1000.0;
        } else if (sexo.equalsIgnoreCase("M") && idade >= 31 && idade <= 40) {
            total = 3500.0;
        } else if (sexo.equalsIgnoreCase("M") && idade > 41) {
            total = 500.0;
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18 && idade <= 21) {
            total = 3500.0;
        } else if (sexo.equalsIgnoreCase("F") && idade >= 22 && idade <= 25) {
            total = 2500.0;
        } else if (sexo.equalsIgnoreCase("F") && idade >= 26 && idade <= 30) {
            total = 1000.0;
        } else if (sexo.equalsIgnoreCase("F") && idade >= 31 && idade <= 40) {
            total = 100.0;
        } else if (sexo.equalsIgnoreCase("F") && idade > 41) {
            total = 50.0;
        }
        System.out.println("---------------------------------------------");
        
        //print
        System.out.println("Seu Nome: " + nome);
        System.out.println("Valor cobrado: " + conversão(total));

        System.out.println("---------------------------------------------");
        //fechar scanner
        ler.close();
    }
}