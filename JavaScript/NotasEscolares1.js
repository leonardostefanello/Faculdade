package exer4;

import java.util.Scanner;


public class Exer4 {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite o nome do aluno e tecle enter");
        String nome=ler.nextLine();
        System.out.println("Digite a Nota1 e tecle enter");
        float n1=ler.nextFloat();
        System.out.println("Digite a Nota2 e tecle enter");
        float n2=ler.nextFloat();
        System.out.println("Digite a Nota3 e tecle enter");
        float n3=ler.nextFloat();
        System.out.println("Digite a Nota4 e tecle enter");
        float n4=ler.nextFloat();
        float media=(n1+n2+n3+n4)/4;
        System.out.println("Aluno: "+nome+" Média: "+media);
        
    }
    
}
