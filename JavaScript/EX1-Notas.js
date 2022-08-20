// NOTA: Script desenvolvido no NetBeans pelo Professor

package exercicio1; //Mude para o nome da sua Package

import java.util.Scanner;


public class Notas { //Mude para o nome da sua Classe

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = ler.nextLine();
        
        System.out.println("Digite a sua idade:");
        int idade = ler.nextInt();
        
        System.out.println("Digite o seu gênero:");
        ler.nextLine();
        String sexo = ler.nextLine();
       
        System.out.println("Digite o seu peso:");
        float peso = ler.nextFloat();
        
        System.out.println("Digite o seu telefone:");
        int telefone = ler.nextInt();
        
        System.out.println("Aluno: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Peso: "+peso);
        System.out.println("Telefone: "+telefone);
    }
    
}
