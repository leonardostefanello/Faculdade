package exercicio1; //Mude para o nome da sua Package

import java.util.Scanner;

public class EX01InfoAluno { 
    public static void main(String[] args) {

        //variáveis
        Scanner ler = new Scanner(System.in);
        String nome, sexo;
        int idade, telefone;
        double peso;

        //informações (inputs)
        System.out.println("Digite o nome do aluno:");
        nome = ler.nextLine();
        System.out.println("Digite a sua idade:");
        idade = ler.nextInt();
        System.out.println("Digite o seu gênero:");
        ler.nextLine(); //scanner fix
        sexo = ler.nextLine();
        System.out.println("Digite o seu peso:");
        peso = ler.nextFloat();
        System.out.println("Digite o seu telefone:");
        telefone = ler.nextInt();

        //print
        System.out.println("Aluno: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Peso: "+peso);
        System.out.println("Telefone: "+telefone);

        //fechar scanner
        ler.close();
    }
}
