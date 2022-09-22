package AulaOnline;

import java.util.Scanner;

public class EX2209 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        
        //variável
        Scanner ler = new Scanner(System.in);
        String nome, apelido, fumante, bebidas, exercicios;
        Integer idade;
        Double altura, peso, imc;

        //leitura
        System.out.println("Digite o Nome: ");
        nome = ler.nextLine();
        System.out.println("Digite o Apelido: ");
        apelido = ler.nextLine();
        System.out.println("Digite a Idade: ");
        idade = ler.nextInt();
        System.out.println("Digite a Altura: ");
        altura = ler.nextDouble();
        System.out.println("Digite o Peso: ");
        peso = ler.nextDouble();
        System.out.println("O paciente fuma?");
        fumante = ler.nextLine();
        ler.nextLine();
        System.out.println("O paciente consome bebidas alcoolicas?");
        bebidas = ler.nextLine();
        System.out.println("O pratica algum exercicio fisico?");
        exercicios = ler.nextLine();

        //calculos
        imc = peso / (altura * altura);

        //decoração + informações
        System.out.println("------------- FICHA DO PACIENTE -------------");
        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Fumante? " + fumante);
        System.out.println("Consome Bebidas Alcoolicas? " + bebidas);
        System.out.println("Pratica Exercicios Fisicos? " + exercicios);
        System.out.println("----------------- RESULTADO -----------------");

        //comparação
        if (imc < 17) {
            System.out.println("Valor do IMC: " + imc);
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Valor do IMC: " + imc);
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Valor do IMC: " + imc);
            System.out.println("Peso Normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Valor do IMC: " + imc);
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Valor do IMC: " + imc);
            System.out.println("Obesidade 1");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Valor do IMC: " + imc);
            System.out.println("Obesidade II (Severa)");
        }
        System.out.println("---------------------------------------------");

        //fechar scanner
        ler.close();
    }
}
