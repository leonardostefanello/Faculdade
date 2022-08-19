package exer6;

import java.util.Scanner;

public class Exer6 {
    
    public static void main(String[] args) {
    Scanner ler=new Scanner(System.in);
    System.out.println("Digite o nome e tecle enter");
    String nome=ler.nextLine();
    System.out.println("Digite a Idade do Aluno");
    int idade=ler.nextInt();
    System.out.println("Digite a nota1 e tecle enter");
    float n1=ler.nextFloat();
    System.out.println("Digite a nota2 e tecle enter");
    float n2=ler.nextFloat();
    System.out.println("Digite a nota3 e tecle enter");
    float n3=ler.nextFloat();
    System.out.println("Digite a nota4 e tecle enter");
    float n4=ler.nextFloat();
    float media=(n1+n2+n3+n4)/4;
    System.out.println("Aluno:"+nome);
    System.out.println("Idate:"+idade);
    System.out.println("Média: "+media);
    
    }
    
}
