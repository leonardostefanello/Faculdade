package progresso;

import java.util.Scanner;

public class EX23IdadeNadador {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");

        //variável
        Scanner ler = new Scanner(System.in);
        int idade;

        //informações (input)
        System.out.println("Digite a idade do Nadador: ");
        idade = ler.nextInt();

        //comparação
        System.out.println("---------------------------------------------");
        if (idade >= 5 && idade <= 7) {
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Adulto");
        }
        System.out.println("---------------------------------------------");

        //fechar scanner
        ler.close();
    }
}