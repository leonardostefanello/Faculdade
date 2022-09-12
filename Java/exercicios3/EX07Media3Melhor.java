package exercicio3;

import java.util.Scanner;
import java.util.Arrays;

public class EX07Media3Melhor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //variável
    double n1, n2, n3, n4, média;

    //informações (inputs)
    System.out.println("Digite a primeira nota: ");
    n1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota: ");
    n2 = scanner.nextDouble();
    System.out.println("Digite a terceira nota: ");
    n3 = scanner.nextDouble();
    System.out.println("Digite a quarta nota: ");
    n4 = scanner.nextDouble();

    //array
    double[] notas = {n1, n2, n3 ,n4};
    Arrays.sort(notas); //organiza a array do menor para maior
    
    //calculos
    média = (notas[3] + notas[2] + notas[1])/3; 
    
    //print
    System.out.println("Nota 1: " + notas[3]);
    System.out.println("Nota 2: " + notas[2]);
    System.out.println("Nota 3: " + notas[1]);
    System.out.println("Média = " + média);
    
    //fechar scanner
    scanner.close();
    }
}